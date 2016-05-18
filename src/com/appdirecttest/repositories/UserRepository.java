package com.appdirecttest.repositories;

import 	com.appdirecttest.models.User;

public interface UserRepository {
	
	public User findById(String id);
	
	public User findByOpenId(String id);
	
	public User findByEmail(String email);
	
	public void insert(User user);
}
