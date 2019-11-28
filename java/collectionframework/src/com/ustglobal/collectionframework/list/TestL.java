package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(12);
		ll.add(123);
		ll.add(45);
		ll.add(25);
		ll.add(456);
//		ll.add(null); // nullPointerException
		
		System.out.println("Before Sorting"+ll);
		Collections.sort(ll);
		System.out.println("After Sorting"+ll);
		
		Collections.reverse(ll);
		System.out.println("After Reverse Method"+ll);
		
		
		Collections.shuffle(ll);
		System.out.println("After Shuffle Operation"+ll);
	}
}
