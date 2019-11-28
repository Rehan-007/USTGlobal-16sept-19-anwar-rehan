package com.ustgobal.set.sorting;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestSortName {

public static void main(String[] args) {
		
		Comparator<Employee> en = (e1,e2) -> {
		
			return e1.name.compareTo(e2.name);
		};
			
	
		
		TreeSet<Employee> t = new TreeSet<>(en);
		
		Employee e1 = new Employee(1, "Kohli", 5.6);
		Employee e2 = new Employee(2, "dhoni", 5.8);
		Employee e3 = new Employee(3, "Rahane", 5.9);
		Employee e4 = new Employee(4, "Rohit", 5.10);

        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        
        System.out.println("Using Iterator");
		
        Iterator<Employee> i = t.iterator();
        while(i.hasNext()) {
        	Employee e = i.next();
        	System.out.println("Id is  = "+e.id);
        	System.out.println("Name is = "+e.name);
        	System.out.println("Height is = "+e.height);
        	System.out.println("--------------------------------------");
        }
	}
}
