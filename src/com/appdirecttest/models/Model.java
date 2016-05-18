package com.appdirecttest.models;

public abstract class Model {
	
	private String id;
	
	public String getId(){
		return this.id;
	}
	
	public void setId(String id){
		this.id = id;
	}
}
