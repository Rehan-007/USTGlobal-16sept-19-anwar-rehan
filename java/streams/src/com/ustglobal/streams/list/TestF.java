package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<>();
		
		Employee e1 = new Employee(1, "Ananya");
		Employee e2 = new Employee(2, "Anu");
		Employee e3 = new Employee(3, "Mota");
		Employee e4 = new Employee(4, "Zuhaib");
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		Comparator<Employee> cmp = (m1,m2) -> {
			
			return m1.name.compareTo(e2.name);
		};
	    List<Employee> l =	al.stream().sorted(cmp).collect(Collectors.toList());
	    Iterator<Employee> i = l.iterator();
	    while(i.hasNext()) {
	    	Employee e = i.next();
	    	System.out.println("Id is = "+e.id);
	    	System.out.println("Name is = "+e.name);
	    	System.out.println("---------------------------------");
	    }
		
	}
}
