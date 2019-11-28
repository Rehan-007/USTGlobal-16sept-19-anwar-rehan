package com.ustglobal.collectionframework.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(34);
		lhs.add(69);
		lhs.add("Rehan");
		lhs.add(69.39);
		lhs.add(34);
		lhs.add(null);
		
		
		System.out.println("================using for each loop==========");
		for (Object o : lhs) {
			System.out.println(o);
		}
		
		System.out.println("=================Iterator===============");
		
		Iterator i = lhs.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}
	}
}
