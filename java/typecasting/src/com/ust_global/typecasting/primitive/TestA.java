package com.ust_global.typecasting.primitive;
public class TestA {

	public static void main(String[] args) {
		byte a=20;
		int b=a;  //Implicit casting
		System.out.println("b is"+b);
		
		int p=20;
		double q=p;
		
		System.out.println("q is "+q);
		
		double x=90.7;
		int y=(int)x;
		System.out.println(y);
		
		byte z=(byte)x;
		System.out.println(z);
		
		char r =(char)x;
		 System.out.println(r);
	}
}