package com.ustglobal.exceptionHandling;

import java.nio.charset.MalformedInputException;

public class MultipleCatch {

	public static void main(String[] args) {
		System.out.println("Main Started");
		
		int a[] = {10,20,30};
		int b = 10;
		
		try {
			
			System.out.println(b/2);
			System.out.println(a[4]);
		
		}
		catch(ArithmeticException ae) {
			System.out.println("cannot be devied by zero");
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("array not in the range");
		}
		
		
		System.out.println("main Ended");
	}
}
