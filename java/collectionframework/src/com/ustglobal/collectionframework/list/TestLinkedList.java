package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add(12);
		ll.add(20.58);
		ll.add("Rehan");
		ll.add(true);
		ll.add(null);
		
		System.out.println("=============For Loop===================");
		
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("=============For each Loop===================");
		for (Object o : ll) {
			System.out.println(o);
		}
		
		System.out.println("=============Iterator===================");
		
		Iterator i = ll.iterator();
		 
		while(i.hasNext()) {
			Object ob = i.next();
			System.out.println(ob);
		}
		
		System.out.println("=============List Iterator===================");
		
		ListIterator li = ll.listIterator();
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
