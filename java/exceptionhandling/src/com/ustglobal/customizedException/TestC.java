package com.ustglobal.customizedException;

import java.util.Scanner;

public class TestC {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in);
				Scanner sc1 = new Scanner(System.in)){
			System.out.println("Enter Age");
			
			int age = sc.nextInt();
			
			System.out.println(age);
			System.out.println(10/0);
			
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		} finally {
			System.out.println(" Excecuted");
		}
	}
}
