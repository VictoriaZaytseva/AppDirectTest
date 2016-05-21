package com.appdirecttest.models;

/**
 * Base class for the Subscription and User models with shared functionality
 * @author victoria
 *
 */
public abstract class BaseModel {
	
	protected String id;
	
	public String getId(){
		return this.id;
	}
	
	public BaseModel(String id) {
		super();
		this.id = id;
	}

	public void setId(String id){
		this.id = id;
	}
}
