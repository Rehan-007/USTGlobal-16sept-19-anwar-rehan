package com.ustglobal.collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Rehan");
		hs.add("Amiya");
		hs.add("Anup");
		hs.add("Mota");
		hs.add("Ashit");
		
		System.out.println("Using for each loop");
		for(Object o : hs){
			System.out.println(o);
		}
		
		System.out.println("================Iterator============");
		
		Iterator i = hs.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}
	}
}
