package com.example.exceptionHandle;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BusinessException extends RuntimeException {

	private String message;
	
	public BusinessException(String message) {
		super(message);
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
