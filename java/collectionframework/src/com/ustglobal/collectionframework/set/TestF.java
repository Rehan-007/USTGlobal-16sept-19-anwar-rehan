package com.ustglobal.collectionframework.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {

	public static void main(String[] args) {
		
		TreeSet<String> t = new TreeSet<>();
		t.add("Ashit");
		t.add("Mota");
		t.add("Divya");
		t.add("Sheela");
		t.add("munni");
		t.add("roopa");
		
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
