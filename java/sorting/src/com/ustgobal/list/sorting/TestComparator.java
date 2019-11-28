package com.ustgobal.list.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestComparator {

	public static void main(String[] args) {
		
		ArrayList<Marker> al = new ArrayList<Marker>();
		
		Marker m1 = new Marker(69.69, "Black");
		Marker m2 = new Marker(67.69, "Blue");
		Marker m3 = new Marker(79.69, "Red");
		Marker m4 = new Marker(80.89, "Green");

		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		
		System.out.println("Before Sorting");
		display(al);
//        SortByPrice sb = new SortByPrice();
//        Collections.sort(al, sb);
        
        System.out.println("After Sorting");
        display(al);
        
        SortByColor sc = new SortByColor();
        Collections.sort(al, sc);
        
        System.out.println("After Color Sorting"+al);

	}
	
	static void display (ArrayList<Marker> m) {
		Iterator<Marker> i = m.iterator();
		while(i.hasNext()) {
			Marker ma = i.next();
			System.out.println("Price is = "+ma.price);
			System.out.println("Color is = "+ma.color);
			System.out.println("---------------------------");
		}
	}
}
