package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestA {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("rehan");
		al.add(69);
		al.add(69.69);
		al.add(true);
		al.add(null);
		
		Object ob = al.get(2);  // to get the specific index
		System.out.println(ob);
		
		for(int i=0; i<5 ; i++) {
			Object obj = al.get(i);
			System.out.println(obj);
		}
	}
}
