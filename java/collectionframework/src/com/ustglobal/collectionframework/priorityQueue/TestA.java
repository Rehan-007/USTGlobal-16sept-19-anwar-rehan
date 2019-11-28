package com.ustglobal.collectionframework.priorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestA {

	public static void main(String[] args) {
	
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(12);
		pq.add(25);
		pq.add(35);
		pq.add(35);
		pq.offer(36);
//		pq.add(null);		NullPointerException

		System.out.println("Using Iterator");
		
		Iterator<Integer> i = pq.iterator();
		while(i.hasNext()) {
			Integer o = i.next();
			System.out.println(pq.poll());
		}
		System.out.println("After Poll "+pq);
	}
}
