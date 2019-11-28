package com.ustgobal.list.sorting;

public class Laptop implements Comparable<Laptop> {

	int price;
	int ram;
	String name;
	
	public Laptop(int price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}

	@Override
	public int compareTo(Laptop li) {
		
		return this.name.compareTo(li.name); 
	}

//	@Override
//	public int compareTo(Laptop li) {
//		
//		Integer a = this.price;
//		Integer b = li.price;
//		
//		return a.compareTo(b);
//	}

//	@Override
//	public int compareTo(Laptop li) {
//		
//		Integer a = this.ram;
//		Integer b = li.ram;
//		
//		return a.compareTo(b);
//	}
	
	
	
}
