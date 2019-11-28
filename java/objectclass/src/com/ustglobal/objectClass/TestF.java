package com.ustglobal.objectClass;

public class TestF {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person p=new Person(15,"ravi");
         
		System.out.println("p id="+p.id);
		System.out.println("p name="+p.name);
		
		Object o = p.clone();
		Person p1 = (Person) o;
		System.out.println("p1 id="+p1.id);
		System.out.println("p1 name="+p1.name);
		
		p1.id=200;
		p1.name="sanjay";
		
		System.out.println("After cloning p1="+p1.id);
		System.out.println("after Cloning p1="+p1.name);
	}
}
