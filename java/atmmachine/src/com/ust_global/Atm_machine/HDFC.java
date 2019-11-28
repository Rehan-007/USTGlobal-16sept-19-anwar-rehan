package com.ust_global.Atm_machine;

public class HDFC implements ATM {

	@Override
	public void validateCard() {
	    
		System.out.println("HDFC VALIDATE METHOD");
	}

	@Override
	public void infoCard() {
		
		System.out.println("HDFC INFOCARD METHOD");
	}

}
