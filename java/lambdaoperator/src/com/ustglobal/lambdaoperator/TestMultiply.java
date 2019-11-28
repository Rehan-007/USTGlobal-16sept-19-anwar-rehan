package com.ustglobal.lambdaoperator;

public class TestMultiply {


	public static void main(String[] args) {
		
		MultiplyInterface multiply = (a,b) -> a*b;
		System.out.println(multiply.multiply(10, 3));
	}
}
