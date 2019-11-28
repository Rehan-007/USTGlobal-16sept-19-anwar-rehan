package com.ustglobal.objectClass;

public class UsbPort {

	public static void connect(Object obj) {
		
		if(obj instanceof PenDrive) {
			PenDrive p=(PenDrive)obj;
			p.read();
			p.write();
		}else if(obj instanceof Mouse) {
			Mouse m=(Mouse)obj;
			m.scroll();
			m.click();
		}else {
			System.out.println("Invalid Object");
		}
	}
}
