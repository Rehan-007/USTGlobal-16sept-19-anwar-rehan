package com.ust_global.Atm_machine;

public class SBI implements ATM {

	@Override
	public void validateCard() {
	   
		System.out.println("SBI VALIDATE METHOD");
	}

	@Override
	public void infoCard() {
		
		System.out.println("SBI INFOCARD METHOD");
	}

}
