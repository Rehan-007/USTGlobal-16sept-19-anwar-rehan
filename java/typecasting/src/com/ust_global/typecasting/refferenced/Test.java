package com.ust_global.typecasting.refferenced;
public class Test {

	public static void main(String[] args) {
		Pen p=new Pen();
		System.out.println(p.cost);
		p.write();


		Pen p1=new Marker();
		p1.write();

        
        
        //Down Casting
         Marker m1=(Marker)p1;
         m1.color();
         System.out.println(m1.size);
         System.out.println(m1.cost);
         m1.write();
	}
}
