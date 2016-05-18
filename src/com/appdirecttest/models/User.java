package com.appdirecttest.models;

public class User extends Model {
	
	private String id;
	private String email;
	private String openId;
	private String firstName;
	private String lastName;
	private String companyId;
	
	public User(String id, String email, String openId, String firstName, String lastName, String companyId,
			String language) {
		super();
		this.id = id;
		this.email = email;
		this.openId = openId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyId = companyId;
		this.language = language;
	}

	private String language;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getOpenId() {
		return openId;
	}
	
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	
}