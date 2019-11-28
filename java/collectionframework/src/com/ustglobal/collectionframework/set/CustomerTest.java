package com.ustglobal.collectionframework.set;

import java.util.Iterator;
import java.util.TreeSet;

public class CustomerTest {

	public static void main(String[] args) {
		
		SortByCid si = new SortByCid();
		SortByCName sn = new SortByCName();
		TreeSet<Customer> t = new TreeSet<>();
		
		Customer c1 = new Customer("Amiya", 1, 120000);
		Customer c2 = new Customer("Ashit", 2, 220000);
		Customer c3 = new Customer("Sheela", 3, 330000);
		Customer c4 = new Customer("Ananya", 4, 440000);

        t.add(c1);
        t.add(c2);
        t.add(c3);
        t.add(c4);
        
        System.out.println("========Using Iterator=============");
        Iterator<Customer> i = t.iterator();
        while(i.hasNext()) {
        	Customer c= i.next();
        	
        	System.out.println("Name is = "+c.name);
        	System.out.println("Id is = "+c.id);
        	System.out.println("Salary is = "+c.sal);
        	System.out.println("----------------------------------");
        }

		
	}
}
