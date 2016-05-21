package com.appdirecttest.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Response to AppDirect API class
 * @author victoria
 *
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Response {
	private Boolean success;
	private String message;
	private String accountIdentifier;
	private String errorCode;

	public static enum ErrorCode {
		USER_ALREADY_EXISTS, ACCOUNT_NOT_FOUND, UNKNOWN_ERROR
	}

	public Response() {
	}

	public Response(Boolean success, String message, String errorCode) {
		this.success = success;
		this.message = message;
		this.errorCode = errorCode;
	}

	public Response(Boolean success, String accountIdentifier) {
		this.success = success;
		this.accountIdentifier = accountIdentifier;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAccountIdentifier() {
		return accountIdentifier;
	}

	public void setAccountIdentifier(String accountIdentifier) {
		this.accountIdentifier = accountIdentifier;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}
