package com.ustglobal.stringclass;

public class TestA {

	public static void main(String[] args) {
		
		String s1="Ananya";
		String s2="Priyanka";
		
		String s3=new String("Aish");
		System.out.println(s3.hashCode());
		
		String s4=new String("Aish");
		System.out.println(s4.hashCode());
		
		String s5="Ananya";
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
		
		String s6 = s1.toLowerCase();
		System.out.println(s6);
		
		String s7 = s1.toUpperCase();
		System.out.println(s7);
		
		char c=s1.charAt(0);
		System.out.println(c);
		
		boolean b=s1.equalsIgnoreCase("Ananya");
		System.out.println(b);
	}
	
}
