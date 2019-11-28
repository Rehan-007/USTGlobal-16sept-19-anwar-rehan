package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {

	public static void main(String[] args) {
		

		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Divya");
		al.add("Ananya");
		al.add("Salman");
		al.add("Priyanka");
		
		System.out.println("Before Sorting"+al);
		Collections.sort(al);
		System.out.println("After Sorting"+al);
	}
}
