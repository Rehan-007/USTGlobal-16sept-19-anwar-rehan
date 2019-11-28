package com.ustglobal.collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(12);
		hs.add(45);
		hs.add("Dipu");
		hs.add(69.69);
		hs.add(12);
		hs.add(null);
		hs.add(null);
		
		System.out.println("=============For Each loop==========");
		for(Object o : hs) {
			System.out.println(o);
		}
		
		System.out.println("====================Using Iterator=========");
		Iterator i = hs.iterator();
		while(i.hasNext()) {
			Object o1 = i.next();
			System.out.println(o1);
		}
	}
}
