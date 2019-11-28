package com.ustglobal.lambdaoperator;

public class TestGreet {

	public static void main(String[] args) {
		
		GreetInterface greet = (message)-> {
			System.out.println(message);
		};
		
		greet.greet("Jai hind Doston");
	}
	
	
}
