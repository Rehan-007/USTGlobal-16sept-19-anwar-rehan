package com.ustglobal.exceptionHandling;

public class ArithException {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		int a=10;
		int b = 0;
		
		try {
			b = 10/0;
			System.out.println("olkjhgfdsa");
		}
		catch(ArithmeticException ae) {
			System.out.println("a number cannot be dived by zero");
		}
		
		System.out.println(b);
		
		System.out.println("Main Ended");
		
		
	}
}
