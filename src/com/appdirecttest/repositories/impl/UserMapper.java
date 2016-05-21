package com.appdirecttest.repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.appdirecttest.models.User;

public class UserMapper implements RowMapper<User> {
	   public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	      User user = new User(rs.getString("id"), rs.getString("email"), rs.getString("open_id"), rs.getString("subscription_id"));
	      return user;
	   }
}