package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(56);
		marks.add(69);
		marks.add(89);
		marks.add(65);
		marks.add(32);
		marks.add(90);
		marks.add(80);
		
	    List<Integer> l =	marks.stream().sorted().collect(Collectors.toList());
	    Iterator<Integer> i = l.iterator();
	    while(i.hasNext()) {
	    	Integer j = i.next();
	    	System.out.println(j);
	    }
	    
		
	}
}
