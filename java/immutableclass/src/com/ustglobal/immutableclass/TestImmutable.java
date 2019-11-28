package com.ustglobal.immutableclass;

public class TestImmutable {

	public static void main(String[] args) {
		
		MyString ms= new MyString(10,"zuhaib");
		
		System.out.println(ms.getName());
		System.out.println(ms.getRollNo());
		System.out.println(ms);
		
		MyString ms1=ms.changeContent(22,"bhau");
		System.out.println(ms.getRollNo());
		System.out.println(ms.getName());
		
		
		System.out.println(ms1.getRollNo());
		System.out.println(ms1.getName());
	}
}
