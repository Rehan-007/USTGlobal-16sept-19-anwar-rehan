package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		

		s.add(12);
		s.add(20.58);
		s.add("Rehan");
		s.add(true);
		s.add(null);
		
		System.out.println("=============For Loop===================");
		
		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		System.out.println("=============For each Loop===================");
		for (Object o : s) {
			System.out.println(o);
		}
		
		System.out.println("=============Iterator===================");
		
		Iterator i = s.iterator();
		 
		while(i.hasNext()) {
			Object ob = i.next();
			System.out.println(ob);
		}
		
		System.out.println("=============List Iterator===================");
		
		ListIterator li = s.listIterator();
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
