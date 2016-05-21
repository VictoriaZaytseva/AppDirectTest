package com.appdirecttest.models;

public class User extends BaseModel {
	//create table users(id varchar(20) primary key, open_id varchar(20), company_id varchar(20), subscription_id varchar(20));
	//alter table users add constraint user_subscription foreign key users(subscription_id) references subscriptions(id) on delete set null;
	private String email;
	private String openId;
	private String subscriptionId;
	
	public User(String id, String email, String openId, String subscriptionId) {
		super(id);
		this.email = email;
		this.openId = openId;
		this.setSubscriptionId(subscriptionId);
	}
		
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
		
	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	
}