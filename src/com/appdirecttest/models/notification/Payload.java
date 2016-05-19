package com.appdirecttest.models.notification;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Payload {
    public String company;
    public String name;
    public String uuid;
    
    public Payload(@JsonProperty("company") String company,
                   @JsonProperty("name") String name,
                   @JsonProperty("uuid") String uuid){
    	this.company = company;
    	this.name = name;
    	this.uuid = uuid;
    }
}