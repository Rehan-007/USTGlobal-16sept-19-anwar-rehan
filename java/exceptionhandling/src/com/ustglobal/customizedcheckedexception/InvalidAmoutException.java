package com.ustglobal.customizedcheckedexception;

public class InvalidAmoutException extends Exception{

	String message = "Daily Limit is 40000";
	 
	@Override
	public String getMessage() {
		
		return message;
	}
}
