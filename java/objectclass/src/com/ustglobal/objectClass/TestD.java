package com.ustglobal.objectClass;

public class TestD {

	public static void main(String[] args) {
		
		Cow c=new Cow(25000, "basanti", "black");
		
		Cow c1=new Cow(25000, "ganga", "brown");
		
		Cow c2=new Cow(25000, "basanti", "black");
		
		
		
		System.out.println(c.equals(c1));
		
		System.out.println(c.equals(c2));
	}
}
