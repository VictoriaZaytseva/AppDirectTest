package com.appdirecttest.repositories;

import java.sql.SQLException;

import 	com.appdirecttest.models.User;
/**
 * It was meant to do user services but it doesnt do it yet
 * @author victoria
 *
 */
public interface UserRepository {
	
	public void insert(User user) throws SQLException;
	public User findById(String id) throws SQLException;
	public User findBySubscriptionId(String subscriptionId);
}
