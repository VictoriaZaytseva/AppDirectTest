package com.appdirecttest.services;

import com.appdirecttest.models.User;
import com.appdirecttest.repositories.impl.SubscriptionRepositoryMySql;
import com.appdirecttest.repositories.impl.UserRepositoryMySql;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.appdirecttest.models.Subscription;

/**
 * Service layer for subscriptions
 * @author victoria
 *
 */
@Service
public class SubscriptionService {
	
	@Autowired
	private UserRepositoryMySql userRepositoryMySql;
	@Autowired
    private SubscriptionRepositoryMySql subscriptionRepositoryMySql;
	
	public void create(User user, Subscription subscription) throws SQLException{
		subscriptionRepositoryMySql.insert(subscription);
		userRepositoryMySql.insert(user);
	};
	
    @Transactional
	public void cancel(String id, String status) throws SQLException{
		subscriptionRepositoryMySql.updateStatus(id, status);
	}
}
