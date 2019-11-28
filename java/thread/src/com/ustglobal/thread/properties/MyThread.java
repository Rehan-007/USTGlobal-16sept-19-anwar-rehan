package com.ustglobal.thread.properties;

public class MyThread extends Thread {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		String name = Thread.currentThread().getName();
		System.out.println("Current Thread "+name);
		
		
		MyThread mt = new MyThread();
		String namem =  mt.getName();
		System.out.println("My Thread Name "+namem);
		
		
		Thread.currentThread().setName("Bala");
		mt.setName("Guldu");
		System.out.println("My THread name "+mt.getName());
		
		System.out.println(10/0);
		
		System.out.println("Main Ended");
		
	}
	
}
