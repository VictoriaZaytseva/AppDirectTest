package com.appdirecttest.models;

public abstract class BaseModel {
	
	protected String id;
	
	public String getId(){
		return this.id;
	}
	
	public void setId(String id){
		this.id = id;
	}
}
