package com.appdirecttest.repositories.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.appdirecttest.models.Subscription;
import com.appdirecttest.models.User;
import com.appdirecttest.repositories.SubscriptionRepository;

@Repository
public class SubscriptionRepositoryMySql implements SubscriptionRepository {
	@Autowired
    JdbcTemplate jdbcTemplate;
	private String Table = "subscriptions";
	private String Fields = "(id, company_name, status, edition)";
	private String QMarks= "?, ?, ?, ?";

	@Override
	public void insert(Subscription subscription) throws SQLException{
		String sql = "INSERT INTO "+ Table + " " + Fields + " VALUES (" + QMarks + ")";
		jdbcTemplate.update(sql, new Object[] {
				subscription.getId(), 
				subscription.getCompanyName(),
				subscription.getStatus(),
				subscription.getEdition()
		});
	}
	
	@Override
	public void updateStatus(String id, String status) throws SQLException{
		String sql = "Update "+Table+" set status = ? where id = ?";
		jdbcTemplate.update(sql, new Object[] {status, id});
	}
	
	@Override
	public Subscription findById(String id) {
		String sql = "SELECT * FROM " + Table + " WHERE id = ?";
		Subscription subscription = jdbcTemplate.queryForObject(sql, 
                new Object[]{id}, new SubscriptionMapper());
		return subscription;
	}
}
