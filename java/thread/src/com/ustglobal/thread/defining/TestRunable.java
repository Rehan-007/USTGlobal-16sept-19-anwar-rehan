package com.ustglobal.thread.defining;

public class TestRunable {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		MyRunable mr = new MyRunable();
		Thread t = new Thread(mr);
		
		t.start();
		for(int i = 0;i<4;i++) {
			System.out.println("Main Thread");
		}
		
		System.out.println("Main Ended");
		
	}
	
}
