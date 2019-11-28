package com.ustglobal.thread.defining;

public class MyRunable implements Runnable {

	@Override
	public void run() {
		
		for(int i =0 ;i<4;i++) {
			System.out.println("Child Thread");
		}
	}

}
