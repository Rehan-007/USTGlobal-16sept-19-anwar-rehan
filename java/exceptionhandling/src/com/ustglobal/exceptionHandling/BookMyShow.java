package com.ustglobal.exceptionHandling;

public class BookMyShow {

	public static void main(String[] args) {
       
		System.out.println("BMS Started");

		PVR p=new PVR();
		
		try {
			 p.book();
			 System.out.println("booking Confirmed");
		}
		catch(ArithmeticException ae) {
			System.out.println("try again later");
			
		}
		
		System.out.println("Bms Ended");
		 
	}
}