package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("Kuku", 369456655);
		hm.put("bala", 0213456);
		hm.put("Sheela", 125789346);
		hm.put(null, 12345876);
		hm.put(null, 1234);

		
		System.out.println("data = "+hm);
		
		hm.put("bala", 02136);

		System.out.println("After Modification = "+hm);
		
		hm.put("Dimple", 369456655);
		System.out.println("data = "+hm);
		
		Object phoneno = hm.get("Sheela");
		System.out.println("Value = "+phoneno);
		
		Object s = hm.get("Bhau");
		System.out.println("Jai hind="+s);
		
		Object re = hm.remove("Kuku");
        System.out.println("Remove = "+re);
        System.out.println("After Removal  = "+hm);
	}
}
