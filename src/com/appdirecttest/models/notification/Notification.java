package com.appdirecttest.models.notification;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Notification {
	public String type;
    public Creator creator;
    public Payload payload;
    public Order order;
    
    public Notification (@JsonProperty("type") String type, 
    		@JsonProperty("creator") Creator creator,
    		@JsonProperty("payload") Payload payload,
    		@JsonProperty("order") Order order){
    	this.type = type;
    	this.creator = creator;
    	this.payload = payload;
    	this.order = order;
    }
}
