package com.ustglobal.maps;

import java.util.Hashtable;

public class TestG {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(1, "Ajay");
		ht.put(201, "vijay");
		ht.put(800, "sexa");
		ht.put(500, "sonu");
		ht.put(2589, "rrr");
		
		ht.put(100, "sriram");
//		ht.put(null, "jonny"); NullPointerException
//		ht.put(69, null); NullPointerException
  

		
		System.out.println("Datas are = "+ht);
	}
}
