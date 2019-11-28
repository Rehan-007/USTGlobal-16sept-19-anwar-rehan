package com.ustglobal.exceptionHandling;

public class TestPAYIR {

	public static void main(String[] args) {
		System.out.println("Main Started");
		
		PayTm p = new PayTm();
		try {
			p.book();
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception Caught in Main");
		} finally {
			System.out.println("Executing");
		}
		
		System.out.println("Main Ended");
	}
}
