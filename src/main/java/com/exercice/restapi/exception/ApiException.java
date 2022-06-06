package com.exercice.restapi.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
public class ApiException {
	
	private  String message;
	private  HttpStatus httpStatus;
	private Date timestamp;
	private int code;
	
	//Constructor
	public ApiException(String message,int code, Date timestamp) {
		super();
		this.message = message;
		
		this.timestamp = timestamp;
		this.code = code;
	}
	public String getMessage() {
		return message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public Date getTimestamps() {
		return timestamp;
	}
	
	
	

}
