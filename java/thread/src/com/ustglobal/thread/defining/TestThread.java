package com.ustglobal.thread.defining;

public class TestThread {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		MyThread mt = new MyThread();
		for(int i = 0;i<4;i++) {
			System.out.println("Main Thread");
		}
		mt.start();
		System.out.println("Main Ended");
		
	}
	
}
