package com.ust_global.typecasting.refferenced;
public class Marker extends Pen{

	double size;
	void color() {
		System.out.println("marker() method ");
	}
	@Override
	void write() {
		System.out.println("marker class write method");
	}
}
