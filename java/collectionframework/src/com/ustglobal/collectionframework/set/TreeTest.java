package com.ustglobal.collectionframework.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeTest {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		t.add(89);
		t.add(34);
		t.add(69);
		t.add(74);
		t.add(85);
//		t.add("Rehan"); class Cast Exception//only generics
//		t.add(null); nullPointerException
		
		System.out.println("================using for each loop==========");
		for (Object o : t) {
			System.out.println(o);
		}
		
		System.out.println("=================Iterator===============");
		
		Iterator i = t.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}
	}
}
