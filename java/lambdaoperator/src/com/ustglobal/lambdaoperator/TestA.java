package com.ustglobal.lambdaoperator;

public class TestA implements AddInterface {

	public static void main(String[] args) {
		

		TestA t = new TestA();
		System.out.println(t.add(10, 20));
	}
	
	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

}
