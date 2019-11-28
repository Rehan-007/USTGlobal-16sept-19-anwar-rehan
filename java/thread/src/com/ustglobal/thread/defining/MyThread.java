package com.ustglobal.thread.defining;

public class MyThread extends Thread {

	public void run() {
		
		for(int i=0;i< 4;i++) {
			System.out.println("Child Thread");
		}
		
	}
	
}
