package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Divya", 69.69);
		Student s2 = new Student(2, "Div", 79.79);
		Student s3 = new Student(3, "Jonny", 59.89);
		Student s4 = new Student(4, "Jasmine", 89.99);
		Student s5 = new Student(5, "Jasm", 99.19);
		Student s6 = new Student(6, "dimple", 49.29);
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> al1 = new ArrayList<>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);

		HashMap< String , ArrayList<Student> > hm = new HashMap<>();
		hm.put("First", al);
		hm.put("Second", al1);
		
		ArrayList<Student> a = hm.get("Second");
		Iterator<Student> i = a.iterator();
		while(i.hasNext()) {
			Student s = i.next();
			System.out.println("Id is = "+s.id);
			System.out.println("Name is  = "+s.name);
			System.out.println("Percentage is = "+s.perce);
			System.out.println("---------------------------------");
		}
		
	}
}
