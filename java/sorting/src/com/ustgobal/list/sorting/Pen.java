package com.ustgobal.list.sorting;

public class Pen implements Comparable<Pen> {

	int price;
	String brand;
	public Pen(int price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	@Override
	public int compareTo(Pen p) {
      
		Integer i = this.price;
		Integer j = p.price;
		return i.compareTo(j);
	}
	
}
