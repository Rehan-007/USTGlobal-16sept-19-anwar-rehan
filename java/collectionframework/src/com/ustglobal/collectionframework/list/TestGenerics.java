package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestGenerics {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Sunny");
		al.add("Savita");
		al.add(null);
		al.add("Kavitha");
		
		String s = al.get(0);
		System.out.println(s.toUpperCase());
		
		Iterator<String> i = al.iterator();
		while (i.hasNext()) {
			String si = i.next();
			System.out.println(si);
		}
		
		System.out.println("list Iterator=================");
		
		ListIterator<String> li = al.listIterator();
		while (li.hasNext()) {
			String ss = li.next();
			System.out.println(ss);
		}
		
		for(String n : al) {
			System.out.println(n);
		}
	}
}
