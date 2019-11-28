package com.ustglobal.collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestG {

	public static void main(String[] args) {
		
		HashSet<Employee> hs = new HashSet<>();
		
		Employee e1 = new Employee(1, "Divya", 225500.52);
		Employee e2 = new Employee(2, "Ananya", 22500.52);
		Employee e3 = new Employee(3, "Priyanka", 225000.52);
		Employee e4 = new Employee(4, "Div", 115500.52);
		Employee e5 = new Employee(4, "Div", 115500.52);


        hs.add(e1);
        hs.add(e2);
        hs.add(e3);
        hs.add(e4);
        hs.add(e5);
        
        System.out.println("================Using Iterator==============");
        
        Iterator<Employee> i = hs.iterator();
        while(i.hasNext()) {
        	Employee e = i.next();
        	System.out.println("Id is = "+e.id);
        	System.out.println("Name is = "+e.name);
        	System.out.println("Salary is= "+e.sal);
        	System.out.println("-------------------------------");
        }

	}
}
