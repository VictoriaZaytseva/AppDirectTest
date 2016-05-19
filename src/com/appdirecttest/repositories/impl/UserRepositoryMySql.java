package com.appdirecttest.repositories.impl;

import com.appdirecttest.models.User;
import com.appdirecttest.repositories.UserRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryMySql extends AbstractRepository implements UserRepository {
	@Autowired
	private DriverManagerDataSource driverManagerDataSource;	
	private String Table = "users";
	private String Fields = "(id, email, open_id, company_id, subscriptionId)";
	private String QMarks= "?, ?, ?, ?, ?";
	
	@Override
	public User findById(String id) {
		String sql = "SELECT * FROM " + Table + "WHERE id = ?";
		Connection conn = null;
	
		try {
			conn = driverManagerDataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			User user = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				user = new User(
					rs.getString("id"),
					rs.getString("email"), 
					rs.getString("open_id"),
					rs.getString("company_id"),
					rs.getString("subscription_id")
				);
			}
			rs.close();
			ps.close();
			return user;
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
	public User findByOpenId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void insert(User user) {
		String sql = "INSERT INTO "+ Table + " " + Fields + " VALUES (" + QMarks + ")";
		Connection conn = null;
		
		try {
			conn = driverManagerDataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user.getId());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getOpenId());
			ps.setString(4, user.getCompanyId());
			ps.setString(5, user.getSubscriptionId());
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
	
}
