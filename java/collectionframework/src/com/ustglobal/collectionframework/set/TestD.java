package com.ustglobal.collectionframework.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {

	public static void main(String[] args) {
		
		LinkedHashSet<Double> lhs = new LinkedHashSet<Double>();
		
		lhs.add(34.35);
		lhs.add(69.69);
		lhs.add(69.39);
		lhs.add(34.35);
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
