package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> m = new TreeMap<String ,Integer>();
		m.put("Sundergarh", 770014);
		m.put("BBSR", 751024);
		m.put("Btm", 560068);
		
		
//		m.put(null, 256789)NullPointerException
		for(Map.Entry<String, Integer> t : m.entrySet()) {
			String s = t.getKey();
			Integer i = t.getValue();
			
			System.out.println("Key is = " +s +", Value is = " + i);
			
			System.out.println("=====================================");
		}
	}
}
