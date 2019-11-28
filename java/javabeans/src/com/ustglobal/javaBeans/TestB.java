package com.ustglobal.javaBeans;

import java.util.Scanner;

public class TestB {

	public static void main(String[] args) {
		System.out.println("Scanner Class");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("age is"+age);
		
		System.out.println("Enter a String");
		String a=sc.next();
		System.out.println("String is "+a);
		
		System.out.println("enter a String");
		String s=sc.nextLine();
		System.out.println("The String is"+s);
		
		System.out.println("are you animal?");
		boolean b=sc.nextBoolean();
		System.out.println(b);
	}
}
