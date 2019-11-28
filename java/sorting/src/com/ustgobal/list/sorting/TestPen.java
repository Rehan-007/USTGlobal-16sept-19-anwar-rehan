package com.ustgobal.list.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestPen {

	public static void main(String[] args) {
		
		ArrayList<Pen> al = new ArrayList<Pen>();
		Pen p1 = new Pen(10, "Linc");
		Pen p2 = new Pen(5, "Alfa");
		Pen p3 = new Pen(100, "Parker");
		Pen p4 = new Pen(20, "Cello");
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		System.out.println("================Before Sorting===============");
		displayPenDetails(al);
		Collections.sort(al);
		System.out.println("=======================After Sorting===================");
		displayPenDetails(al);
		Collections.sort(al);
        


		
	}
	
	static void displayPenDetails(ArrayList<Pen> p) {
		
		Iterator<Pen> i = p.iterator();
		while(i.hasNext()) {
			Pen pe = i.next();
			System.out.println("Price is = "+pe.price);
			System.out.println("Brand is = "+pe.brand);
			System.out.println("---------------------------------");
		}
	}
}
