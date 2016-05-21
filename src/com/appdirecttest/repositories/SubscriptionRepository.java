package com.appdirecttest.repositories;

import java.sql.SQLException;

import com.appdirecttest.models.Subscription;

public interface SubscriptionRepository {

	public void insert(Subscription subscription) throws SQLException;
	public void updateStatus(String id, String status)throws SQLException;
	public Subscription findById(String id); 

//	public void update(Subscription subscription);
//	
}
