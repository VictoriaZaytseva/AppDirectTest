package com.appdirecttest.models;

public class User extends BaseModel {
	//create table users(id varchar(20) primary key, open_id varchar(20), company_id varchar(20), subscription_id varchar(20));
	//alter table users add constraint user_subscription foreign key users(subscription_id) references subscriptions(id) on delete set null;
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