package com.appdirecttest.repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.appdirecttest.models.User;
import com.appdirecttest.repositories.UserRepository;

@Repository
public class UserRepositoryMySql implements UserRepository {
	@Autowired
    JdbcTemplate jdbcTemplate;
	private String Table = "users";
	private String Fields = "(id, email, open_id, subscription_id)";
	private String QMarks= "?, ?, ?, ?";
	
	@Override
	public void insert(User user) throws SQLException{
		String sql = "INSERT INTO "+ Table + " " + Fields + " VALUES (" + QMarks + ")";
		jdbcTemplate.update(sql, new Object[] { user.getId(), 
				user.getEmail(),
				user.getOpenId(),
				user.getSubscriptionId()});
	}
	@Override
	public User findById(String id) throws SQLException{
		String sql = "SELECT * FROM " + Table + " WHERE id = ?";
		User user = jdbcTemplate.queryForObject(sql, 
                new Object[]{id}, new UserMapper());
		return user;
	}
	public User findBySubscriptionId(String subscriptionId) {
		String sql = "SELECT * FROM " + Table + " WHERE subscription_id = ?";
		User user = jdbcTemplate.queryForObject(sql, 
                new Object[]{subscriptionId}, new UserMapper());
		return user;
	}
}
