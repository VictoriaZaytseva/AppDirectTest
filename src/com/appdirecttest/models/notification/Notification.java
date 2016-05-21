package com.appdirecttest.models.notification;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Notification and it's subclasses
 * @author victoria
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Notification {

	public Type type;
	public MarketPlace marketplace;
	public String applicationUuid;
	public Flag flag;
	public Creator creator;
	public Payload payload;

	@JsonCreator
	public Notification(@JsonProperty("type") Type type, @JsonProperty("marketplace") MarketPlace marketplace,
			@JsonProperty("applicationUuid") String applicationUuid, @JsonProperty("flag") Flag flag,
			@JsonProperty("creator") Creator creator, @JsonProperty("payload") Payload payload) {
		this.type = type;
		this.marketplace = marketplace;
		this.applicationUuid = applicationUuid;
		this.flag = flag;
		this.creator = creator;
		this.payload = payload;
	}

	public enum Type {
		SUBSCRIPTION_ORDER, SUBSCRIPTION_CHANGE, SUBSCRIPTION_CANCEL, SUBSCRIPTION_NOTICE, USER_ASSIGNMENT, USER_UNASSIGNMENT, USER_UPDATED
	}

	public enum Flag {
		STATELESS, DEVELOPMENT
	}

}
