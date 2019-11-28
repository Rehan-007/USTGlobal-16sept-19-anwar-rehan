package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestE {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add("Ananya");
		
		
		Object o = ar.get(0);
		String name = (String)o;
		System.out.println(name.toUpperCase());
	}
}
