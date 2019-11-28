package com.ustgobal.list.sorting;

import java.util.LinkedList;

public class TestC {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(25);
		ll.add(56);
		ll.add(69);
		ll.add(27);
		ll.add(86);
		
		Integer pk = ll.peek();
		System.out.println("After peek Operation ="+pk);
		
		Integer pkFirst = ll.peekFirst();
		System.out.println("After peek first Operation="+pkFirst);
		
		Integer pkLast = ll.peekLast();
		System.out.println("After Peek Last Operation="+ pkLast);
		
		Integer poll = ll.poll();
		System.out.println("After Poll operation = " +poll);
		 
		Integer pollFirst = ll.pollFirst();
		System.out.println("After Poll first Operation="+pollFirst);
		
		Integer pollLast = ll.pollLast();
		System.out.println("After Poll last Operation = "+pollLast);
		
		System.out.println(ll);
		
	    ll.push(100);
	    System.out.println("After Push Operation"+ll);
	    
	    Integer p = ll.pop();
	    System.out.println("After Pop Operation "+ll);
	}
}
