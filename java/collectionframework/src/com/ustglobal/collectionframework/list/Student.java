package com.ustglobal.collectionframework.list;

public class Student {

	int id;
	String name;
	double perce;
	
	public Student(int id, String name, double perce) {
		super();
		this.id = id;
		this.name = name;
		this.perce = perce;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", perce=" + perce + "]";
	}
	
	
}
