package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> m = new LinkedHashMap<String ,Integer>();
		m.put("BBSR", 751024);
		m.put("Btm", 560068);
		m.put("Sundergarh", 770014);
		
		System.out.println(m);
		
		Set<String> s =  m.keySet();
		System.out.println("Key Values  = "+s);
		
	
		for(String Key : s) {
			System.out.println(Key);
		}
		
		Collection<Integer> c = m.values();
		System.out.println(c);
		
		for(Integer i : c) {
			System.out.println(i);
		}
		
		
	}
}
