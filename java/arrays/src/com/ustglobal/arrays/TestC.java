package com.ustglobal.arrays;

public class TestC {

	

	public static void main(String[] args) {
		
		Student s=new Student(12,"Rehan", 69.4);
		Student s1=new Student(13,"chinku", 77.4);
		Student s2= new Student(14,"nitin", 66.94);
		
		Student[] students = new Student[3] ;
		
		students[0] = s;
		students[1]= s1;
		students[2] = s2;
		
		for (Student st : students) {
			System.out.println(st);
		}
	}
	
	static void recieve (Student[] stu) {
		for(Student s:stu) {
			System.out.println(s);
		}
	}
}
