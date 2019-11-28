package com.ust_global.Atm_machine;

public class TestA {

	public static void main(String[] args) {
		Machine m=new Machine();
		HDFC h=new HDFC();
		m.slot(h);
		
//		ATM m=new HDFC();
//		m.validateCard();
		
		
		System.out.println("**************************************");
		
		ICICI i=new ICICI();
		m.slot(i);
		
		System.out.println("**************************");
		
		SBI s=new SBI();
		m.slot(s);
		
		
	}
}