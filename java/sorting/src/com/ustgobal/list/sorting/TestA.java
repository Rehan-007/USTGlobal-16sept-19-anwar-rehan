package com.ustgobal.list.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class TestA {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(1, "Ananya", 69.69);
		Student s2 = new Student(2, "PriyaNka", 67.79);
		Student s3 = new Student(3, "MIa", 79.89);
		Student s4 = new Student(4, "JonnY", 89.80);

        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        System.out.println("before Sorting");
        displayStudentDetails(al);
        Collections.sort(al);
        
        System.out.println("After Sorting");
        
        displayStudentDetails(al);
        Collections.sort(al);
        
        
		
	}
	
	static void displayStudentDetails(ArrayList<Student> al1) {
		Iterator<Student> i = al1.iterator();
		while(i.hasNext()) {
			
			Student s = i.next();
			System.out.println("Name is "+s.name);
			System.out.println("id is "+s.id);
			System.out.println("Percentage is "+s.perce);
			System.out.println("---------------------------------------");
			
		}
	}
}
