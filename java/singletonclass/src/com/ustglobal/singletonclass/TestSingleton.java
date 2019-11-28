package com.ustglobal.singletonclass;

public class TestSingleton {

	public static void main(String[] args) {
		
		String s1="jai hind";
		MySingleton ms =  MySingleton.getDBConnection();
		System.out.println(ms);
		
		ms.s="jai hind doston";
		System.out.println(ms.s);
		
		System.out.println(ms.hashCode());
		
		MySingleton mx =  MySingleton.getDBConnection();
		mx.s="nikal";
		System.out.println(mx.hashCode());
	}
}
