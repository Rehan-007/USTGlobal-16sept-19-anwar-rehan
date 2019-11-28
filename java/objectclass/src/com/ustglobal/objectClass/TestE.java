package com.ustglobal.objectClass;

public class TestE {

	public static void main(String[] args) {
		
		Employee e=new Employee(12,"Chandu", 10000000);
		
		Employee e1=new Employee(13,"Rehan", 45616648);
		
		Employee e2=new Employee(12,"Chandu", 10000000);
		
		System.out.println(e.equals(e1));
		
		System.out.println(e.equals(e2));
		
		System.out.println(e.toString());
		
		System.out.println(e1.toString());
		
		System.out.println(e2.toString());
		
	}
}
