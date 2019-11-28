package com.ustglobal.objectClass;

public class Test {

	public static void main(String[] args) {
		
		PenDrive p=new PenDrive();
		UsbPort.connect(p);
		
		System.out.println("=======================================================");
		
		Mouse m=new Mouse();
		UsbPort.connect(m);
	}
}
