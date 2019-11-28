package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> m = new LinkedHashMap<String ,Integer>();
		m.put("BBSR", 751024);
		m.put("Btm", 560068);
		m.put("Sundergarh", 770014);
		
		//Entry Set
		
		for(Map.Entry<String, Integer> m1 : m.entrySet()) {
			String s = m1.getKey();
			Integer i = m1.getValue();
			System.out.println("Ket is = "+s+ " ,value is = "+i);
			System.out.println("--------------------------------------");
		}
	}
	
	
	
	
}
