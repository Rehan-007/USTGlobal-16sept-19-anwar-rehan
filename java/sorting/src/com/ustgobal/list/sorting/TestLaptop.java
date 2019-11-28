package com.ustgobal.list.sorting;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestLaptop {


	public static void main(String[] args) {
		
		LinkedList<Laptop> l =new LinkedList<Laptop>();
		
		
		Laptop l1 = new Laptop(25000, 8, "HP");
		Laptop l2 = new Laptop(50000, 6, "ASus");
		Laptop l3 = new Laptop(250000, 16, "Rog");
		Laptop l4 = new Laptop(90000, 16, "Pavilion");

	    l.add(l1);
	    l.add(l2);
	    l.add(l3);
	    l.add(l4);
	    
	    System.out.println("====================Before Sorting====================");
	    displayLaptopDetails(l);
	    Collections.sort(l);
	    
	    System.out.println("================After Sorting=======================");
	    
	    displayLaptopDetails(l);
	    Collections.sort(l);
	    
	}
	
	static void displayLaptopDetails(LinkedList<Laptop> l) {
		Iterator<Laptop> i = l.iterator();
		while(i.hasNext()) {
			Laptop lp = i.next();
			System.out.println("Price is = "+lp.price);
			System.out.println("Ram is= "+lp.ram);
			System.out.println("Name is = "+lp.name);
			System.out.println("-----------------------------------------");
		}
	}

}
