package com.appdirecttest.repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.appdirecttest.models.Subscription;
import com.appdirecttest.models.User;

public class SubscriptionMapper implements RowMapper<Subscription> {
	   public Subscription mapRow(ResultSet rs, int rowNum) throws SQLException {
	      Subscription subscription = new Subscription(rs.getString("id"), rs.getString("company_name"), rs.getString("status"),
	    		  rs.getString("edition"));
	    
	      return subscription;
	   }
}
