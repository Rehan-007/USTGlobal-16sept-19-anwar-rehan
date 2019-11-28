package com.ustglobal.javaBeans;

public class DataBase {

	void recieve(Student s) {
		
		System.out.println("id is"+s.getId());
		System.out.println("name is"+s.getName());
		System.out.println("rollNo is"+s.getRollNo());
		
		System.out.println("**********************************");
	}
	
	void recieveEmployee(Employee e) {
		System.out.println("id is "+e.getId());
		System.out.println("sal is "+e.getSal());
		System.out.println("name is "+e.getName());
		System.out.println("dept is "+e.getDept());
		System.out.println("designation is "+e.getDesig());
	}
}
