package com.exercice.restapi.exception;

public class ApiRequestException extends RuntimeException {

	public ApiRequestException(String message) {

		super(message);
	}

	public ApiRequestException() {

	}

}
