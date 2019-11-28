package com.ustglobal.immutableclass;

public final class MyString {

	private final int rollNo;
	private final String name;
	
	public MyString(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public MyString changeContent (int rollNo , String name) {
		MyString ms = new MyString(rollNo,name);
         return ms;		
	}
	
}
