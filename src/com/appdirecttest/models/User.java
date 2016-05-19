package com.appdirecttest.models;

public class User extends BaseModel {
	
	private String email;
	private String openId;
	private String companyId;
	private String subscriptionId;
	
	public User(String id, String email, String openId, String companyId, String subscriptionId) {
		super();
		this.id = id;
		this.email = email;
		this.openId = openId;
		this.companyId = companyId;
		this.setSubscriptionId(subscriptionId);
	}
	
	private String language;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getOpenId() {
		return openId;
	}
	
	public void setOpenId(String openId) {
		this.openId = openId;
	}
		
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getCompanyId() {
		return companyId;
	}
	
	public void setCompany(String companyId) {
		this.companyId = companyId;
	}

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	
}