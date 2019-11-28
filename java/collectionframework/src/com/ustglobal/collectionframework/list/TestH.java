package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestH {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		

	     v1.add(12);
		v1.add(20.58);
		v1.add("Rehan");
		v1.add(true);
		v1.add(null);
		
		System.out.println("=============For Loop===================");
		
		for (int i = 0; i < v1.size(); i++) {
			System.out.println(v1.get(i));
		}
		
		System.out.println("=============For each Loop===================");
		for (Object o : v1) {
			System.out.println(o);
		}
		
		System.out.println("=============Iterator===================");
		
		Iterator i = v1.iterator();
		 
		while(i.hasNext()) {
			Object ob = i.next();
			System.out.println(ob);
		}
		
		System.out.println("=============List Iterator===================");
		
		ListIterator li = v1.listIterator();
		while(li.hasNext()) {
			Object obj = li.next();
			System.out.println(obj);
		}
		
		System.out.println("=============List Iterator BackWard===================");
		
		while (li.hasPrevious()) {
			Object o1 = li.previous();
			System.out.println(o1);
		}
	}
}
