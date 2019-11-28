package com.ustglobal.exceptionHandling;

public class B extends Test {

	private void m1() {
		System.out.println("m1 method of b class");
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		b.m1();
	}
}
