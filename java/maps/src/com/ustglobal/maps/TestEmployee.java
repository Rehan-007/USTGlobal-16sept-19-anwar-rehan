package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1  = new Employee(1, "Annaya", 25833);
		Employee e2  = new Employee(2, "Divya", 25844);
		Employee e3  = new Employee(3, "Amiya", 2583568);
		Employee e4  = new Employee(4, "Ashit", 35833);
		Employee e5  = new Employee(5, "Mota", 455833);
		Employee e6  = new Employee(6, "Rups", 269833);
		Employee e7  = new Employee(7, "Priyanka", 99833);
		
		ArrayList<Employee> manager = new ArrayList<>();
		manager.add(e1);
		manager.add(e2);
		manager.add(e3);
		manager.add(e4);
		
		ArrayList<Employee> manager2 = new ArrayList<>();
		manager2.add(e5);
		manager2.add(e6);
		manager2.add(e7);
		
		HashMap<Integer, ArrayList<Employee>> hm = new HashMap<>();
		hm.put(1, manager);
		hm.put(2, manager2);
		
		ArrayList<Employee> a = hm.get(1);
		ArrayList<Employee> ae = hm.get(2);

		Iterator<Employee> i =a.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println("Id is = "+e.id);
			System.out.println("Name is  = "+e.name);
			System.out.println("Salary is  = "+e.sal);
			System.out.println("----------------------------------");
		}
		
		System.out.println("=====================SEcond===================");
		Iterator<Employee> i1 =ae.iterator();
		while(i1.hasNext()) {
			Employee em = i1.next();
			System.out.println("Id is = "+em.id);
			System.out.println("Name is  = "+em.name);
			System.out.println("Salary is  = "+em.sal);
			System.out.println("----------------------------------");
		}
		
		
	}
}
