package com.ustglobal.customizedException;

public class TestAge {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		Validator v = new Validator();
	    try {
		v.verify(17);
	    } catch (InvalidAgeException iae) {
	    	System.out.println("Exception Handled");
	    }
	    
	    v.verify(13);
		System.out.println("Main Ended");
		
	}
}
