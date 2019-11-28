package com.ustglobal.thread.properties;

public class MyIdThread extends Thread {

	public static void main(String[] args) {
		
		System.out.println("MAin Started");
		
		System.out.println("main Id "+Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		System.out.println("mid Thread "+mi.getId());
		
//		Thread.currentThread().setPriority(16); IllegalArgumentException
		
		System.out.println("MAin Ended");
		
	}
	
}
