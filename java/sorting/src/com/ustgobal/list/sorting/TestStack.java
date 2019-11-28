package com.ustgobal.list.sorting;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		
		s.add(25);
		s.add(69);
		s.add(58);
		s.add(67);
		
		System.out.println("Using get()");
		for(int i = 0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
		
		int j=s.size();
		System.out.println("using pop Operation");
		for(int i = 0;i<j;i++) {
			System.out.println(s.pop());
		}
	}
}
