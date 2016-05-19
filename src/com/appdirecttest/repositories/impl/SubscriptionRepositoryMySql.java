package com.appdirecttest.repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.appdirecttest.models.Subscription;
import com.appdirecttest.models.User;
import com.appdirecttest.repositories.SubscriptionRepository;

@Repository
public class SubscriptionRepositoryMySql extends AbstractRepository implements SubscriptionRepository {
	@Autowired
	private DriverManagerDataSource driverManagerDataSource;	
	private String Table = "subscriptions";
	private String Fields = "(id, company_name, status, edition)";
	private String QMarks= "?, ?, ?, ?";

	@Override
	public void create(Subscription subscription) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO "+ Table + " " + Fields + " VALUES (" + QMarks + ")";
		Connection conn = null;
		
		try {
			conn = driverManagerDataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, subscription.getId());
			ps.setString(2, subscription.getCompanyName());
			ps.setString(3, subscription.getStatus());
			ps.setString(4, subscription.getEdition());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}

	@Override
	public void update(Subscription subscription) {
		// TODO Auto-generated method stub
		String sql = "UPDATE subscriptions SET status = ?, edition = ? WHERE id = ?";
		Connection conn = null;
		
		try {
			conn = driverManagerDataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(3, subscription.getStatus());
			ps.setString(4, subscription.getEdition());
			ps.setString(1, subscription.getId());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}

	@Override
	public Subscription findById(String id) {
		String sql = "SELECT * FROM " + Table + "WHERE email = ?";
		Connection conn = null;
	
		try {
			conn = driverManagerDataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			Subscription subscription = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				subscription = new Subscription(
					rs.getString("id"),
					rs.getString("company_name"), 
					rs.getString("status"),
					rs.getString("edition")
				);
			}
			rs.close();
			ps.close();
			return subscription;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
		
	}
}
