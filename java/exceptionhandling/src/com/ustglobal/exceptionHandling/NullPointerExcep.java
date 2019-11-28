package com.ustglobal.exceptionHandling;

import java.nio.charset.MalformedInputException;

public class NullPointerExcep {

	public static void main(String[] args) {

		System.out.println("Main Started");
		String s=null;
		int a[] = {10,20,30};
		int b = 10;

		try {

			String s1 = s.toUpperCase();
			System.out.println(s);
			System.out.println(a[2]);
			System.out.println(b/0);

		}
		
	
		catch(NullPointerException npe) {
			System.out.println("null cannot be used");
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("Array out of range");
		}
		catch(ArithmeticException ae) {
			System.out.println("not found data");
		}

	

		System.out.println("Main Ended");
	}
}
