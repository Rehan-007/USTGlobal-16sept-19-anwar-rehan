package com.ust_global.Atm_machine;

public class ICICI implements ATM {

	@Override
	public void validateCard() {
		
		System.out.println("ICICI VALIDATE CARD METHOD");
	}

	@Override
	public void infoCard() {
		
		System.out.println("ICICI INFOCARD METHOD");
	}

}
