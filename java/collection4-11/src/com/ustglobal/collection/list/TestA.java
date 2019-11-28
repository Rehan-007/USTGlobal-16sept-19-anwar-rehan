package com.ustglobal.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestA {

	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(37.5);
		al.add(69.69);
		al.add(66.2);
		al.add(74.74);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
		al.add(3, 34.5);
		System.out.println("After Index Insertion"+al);
		
		al.remove(0);
		System.out.println("After Index Removal"+al);
		
		al.remove(null);
		System.out.println("After Index Insertion"+al);
      
		Double val = al.get(3);
		System.out.println("After Index get="+val);
		
		al.set(2,77.9);
		System.out.println("After Index seting"+al);
		
		al.clear();
		System.out.println("After Clearing"+al);
		
		System.out.println(al.isEmpty());
		
		
		
		
		List<Double> l = new ArrayList<>();
		l.add(12.3);
		l.add(23.5);
		l.add(34.5);
		l.add(22.5);
		  
		al.addAll(l);
		
		System.out.println("After Adding list Element to ArrayList = "+al);

        boolean contains = al.contains(l);
        System.out.println("Contains method="+ contains);
        boolean res = al.removeAll(l);
        System.out.println(res);
        

	}
}
