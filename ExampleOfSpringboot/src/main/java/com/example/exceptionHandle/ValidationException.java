package com.example.exceptionHandle;

public class ValidationException extends RuntimeException {
	
	private String message;
	
	public ValidationException(String message) {
		super(message);
		this.message = message;
	}
	
	public String getsMess( ) {
		return this.message;
	}

}
