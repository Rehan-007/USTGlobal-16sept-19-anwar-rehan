package com.ustglobal.thread.properties;

public class MyPriorityThread extends Thread {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		int p = Thread.currentThread().getPriority();
		System.out.println("Priority "+p);
		
		Thread.currentThread().setPriority(7);
		System.out.println("main Thread Priority "+Thread.currentThread().getPriority());
		
		MyPriorityThread mpt = new MyPriorityThread();
		int q = mpt.getPriority();
		System.out.println("My Priority Thread priority "+q);
		
		mpt.setPriority(6);
		System.out.println("mypriority thread priority "+mpt.getPriority());
		
		System.out.println("Main Ended");
		
	}
	
}
