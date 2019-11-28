package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("Kuku", 369456655);
		hm.put("bala", 0213456);
		hm.put("Sheela", 125789346);
		hm.put(null, 12345876);
		
		HashMap hm1 = new HashMap();
	    hm1.put("Deepu", 7890099);
	    hm1.put("riya", 678953);
	    hm1.put("Kriti", 4578963);
	    
	   boolean a =  hm.containsKey("bala");
	   System.out.println(a);
	   System.out.println("=============================");
	   
	   boolean value  = hm.containsValue(369456655);
	   System.out.println("Value  = "+value);
	   System.out.println("=============================");

	
	   hm.putAll(hm1); // to merge two maps
	   System.out.println("After Putting hm1 in hm = "+hm);
	   System.out.println("=============================");
	   
	   System.out.println(hm.size());
	   
	   System.out.println(hm.isEmpty());
	   System.out.println("=============================");

	   hm.clear();
	   System.out.println("clear "+hm);

	}
}
