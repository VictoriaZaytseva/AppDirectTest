package com.appdirecttest.models;

public class Subscription extends BaseModel {
	//create table subscriptions(id varchar(20) primary key, company_name varchar(80), status varchar(40), edition varchar(40));
	private String companyName;
	private String status;
	private String edition;
	
	public static enum NoticeType {
		  	DEACTIVATED,
		  	REACTIVATED,
		  	CLOSED,
		  	UPCOMING_INVOICE
	}
	public Subscription(String id, String companyName, String status, String edition) {
		super(id);
		this.id = id;
		this.companyName = companyName;
		this.status = status;
		this.edition = edition;
	}

	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
}
