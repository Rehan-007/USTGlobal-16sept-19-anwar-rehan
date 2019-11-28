package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestD {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(56);
		marks.add(69);
		marks.add(89);
		marks.add(65);
		marks.add(32);
		marks.add(90);
		marks.add(80);
		
		Comparator<Integer> cmp = (m1,m2) -> {
			if(m1>m2) {
				return 1;
			} else if(m1<m2) {
				return -1;
			} else {
				return 0;
			}
		};
		long passStudent = marks.stream().filter(i -> i<35).count();
		System.out.println(passStudent);
		
		System.out.println("=====================================");
		
		System.out.println(marks.stream().min(cmp).get()); // for min value
		System.out.println("---------------------------------");
		
		System.out.println(marks.stream().max(cmp).get()); //for max value
	}
}
