package com.appdirecttest.repositories;

import com.appdirecttest.models.Subscription;

public interface SubscriptionRepository {

	public void create(Subscription subscription);
	
	public void update(Subscription subscription);
	
	public Subscription findById(String id); 
}
