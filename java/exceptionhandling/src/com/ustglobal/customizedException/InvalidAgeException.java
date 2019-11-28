package com.ustglobal.customizedException;

public class InvalidAgeException extends RuntimeException {

	String message = "Inavlid Age";
	
	public InvalidAgeException() {
		
	}
	
	public InvalidAgeException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}