package com.appdirecttest.models.notification;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Creator {
    public String email;
    public String openId;
    public String uuid;
    
    public Creator(@JsonProperty("email") String email, @JsonProperty("openId") String openId, @JsonProperty("uuid") String uuid){
    	this.email = email;
    	this.openId = openId;
    	this.uuid = uuid;
    }
}
