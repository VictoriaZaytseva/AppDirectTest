package com.appdirecttest.models.notification;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Payload {

	public Company company;
	public Order order;

	@JsonCreator
	public Payload(@JsonProperty("company") Company company, @JsonProperty("order") Order order) {
		this.company = company;
		this.order = order;
	}

}