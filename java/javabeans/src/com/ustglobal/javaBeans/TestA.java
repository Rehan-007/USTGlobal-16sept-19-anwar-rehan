package com.ustglobal.javaBeans;

public class TestA {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.setId(2);
		s.setName("Rehan");
		s.setRollNo(11);
		
		DataBase db=new DataBase();
		db.recieve(s);
		
		Employee e=new Employee();
		e.setId(12);
		e.setSal(132456789);
		e.setName("Bantai");
		e.setDept("Under Ground");
		e.setDesig("Wrapper");
		db.recieveEmployee(e);
	}
}
