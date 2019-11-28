package com.ustglobal.hasarelation.weak;

public class Test {

	public static void main(String[] args) {
		Person p=new Person();
		System.out.println(p.name);
	
		p.sleep();
		p.eat();
		
		p.m.write();
		
		
		Car c=new Car();
		System.out.println(c.name);
		c.m.playMusic();
	}
}
