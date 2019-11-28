package com.ust_global.accessModifiers.pkg1;

import com.ust_global.accessModifiers.pkg2.Demo;

public class Sample extends Demo {

	public static void main(String[] args) {
		
		Demo d= new Demo();
//		System.out.println(d.a); error
		//Default
//		System.out.println(d.b);
//		d.sub();
//		
		Sample s=new Sample();
		
		//Protected
		System.out.println(s.c);
		s.mul();
		//Public
		System.out.println(d.name);
		d.div();
		
	}
}