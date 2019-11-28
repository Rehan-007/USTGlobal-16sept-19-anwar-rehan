package com.ustglobal.objectClass;

public class TestC {

	public static void main(String[] args) {
		
		Car c=new Car(5000000,"Duster", "Silver");
		Car c1=new Car(12000000,"Lamborgini", "Matt-black");
		System.out.println(c);
		System.out.println(c1);
		
		
		System.out.println(c.hashCode());
	}
}
