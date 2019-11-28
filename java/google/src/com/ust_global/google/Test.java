package com.ust_global.google;

public class Test {

	public static void main(String[] args) {
		Browser b=new Browser();
		Google g=new Gmail();
		b.newTab(g);
		
		System.out.println("****************************************");
		
		Google g1=new GoogleDrive();
		b.newTab(g1);
	}
}
