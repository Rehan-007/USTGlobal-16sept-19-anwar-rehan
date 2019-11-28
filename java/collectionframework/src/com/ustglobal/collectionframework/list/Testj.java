package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class Testj {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		Student s= new Student(101,"Ananya",69.69);
		Student s1= new Student(102,"Priyanka",64.69);
		Student s2= new Student(103,"Tammna",69.55);
	
		al.add(s);
		al.add(s2);
		al.add(s2);
		
		for (int i = 0; i < al.size(); i++) {
			Student s4 =al.get(i);
			System.out.println("id is"+s4.id);
			System.out.println("name is"+s4.name);
			System.out.println("perce is "+s4.perce);
		}
		
		System.out.println("==============for each loop===========");
		
		for(Student ss : al) {
			System.out.println(ss);
		}
	}
}
