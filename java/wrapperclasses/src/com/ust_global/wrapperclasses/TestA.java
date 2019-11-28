package com.ust_global.wrapperclasses;
public class TestA {

	public static void main(String[] args) {
		int a=10;
		System.out.println("a="+a);
		 Integer i=a; //Auto-Boxing
		 System.out.println("i="+i);
		 
		 Integer x=10;
		 Integer z=new Integer(20);
	     System.out.println("z="+z);	 
	
		  System.out.println("x ="+x);
		  
		  int y=x;
		   System.out.println("y ="+y);
		   
		   //Parsing method
		   
		   boolean value = Boolean.parseBoolean("true");
		   System.out.println(value);
		   
		   int value1=Integer.parseInt("123");
		   System.out.println(value1);
		   
		   double value3=Double.parseDouble("1234.33");
		   System.out.println(value3);
		   
		   
	}
}