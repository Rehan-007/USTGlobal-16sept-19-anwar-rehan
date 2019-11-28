package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(10);
		al.add(69.69);
		al.add(true);
		al.add("Sunny");

		Iterator it = al.iterator();
		Object ob = it.next();
		System.out.println(ob);

		Object o2 = it.next();
		System.out.println("Object o2"+o2);

		Object o3 = it.next();
		System.out.println("Object o2"+o3);

		Object o4 = it.next();
		System.out.println("Object o2"+o4);

		boolean b = it.hasNext();
		System.out.println("Has Next"+b);

//		Object o5 = it.next();
//		System.out.println("Object o2"+o5); no such element Exception

		//		for(int i=0 ; i<al.size() ; i++) {
		//			Object o = al.get(i);
		//			System.out.println(o);
		//			}
		
		ArrayList ar = new ArrayList();
		ar.add(22);
		ar.add("Rehan");
		ar.add(223.5);
		ar.add(false);
		
		Iterator il = ar.iterator();
		
//		while(il.hasNext()) {
//			Object obj = il.next();
//			System.out.println(obj);
//		}
		System.out.println("===============For loop=================");
		
		for(;il.hasNext();) {
			Object obj = il.next();
			System.out.println(obj);
		}
	}
	
}
