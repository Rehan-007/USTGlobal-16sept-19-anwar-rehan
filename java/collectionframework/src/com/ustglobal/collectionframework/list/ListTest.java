package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListTest {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add(69.69);
		ar.add("Yash");
		ar.add(true);
		
		ListIterator li = ar.listIterator();
		
		System.out.println("----------------->Iterator");
		
		while(li.hasNext()) {
			Object obj = li.next();
			System.out.println(obj);
		}
		System.out.println("<----------------- List Iterator");
		while(li.hasPrevious()) {
			Object o = li.previous();
			System.out.println(o);
		}
	}
}
