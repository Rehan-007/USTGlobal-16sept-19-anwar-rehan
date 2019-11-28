package com.ustglobal.customizedcheckedexception;

public class TestAmount {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		ValidateAmount va = new ValidateAmount();
		try {
			va.checkAmount(410000);
			System.out.println("collect your cash");
		} catch (InvalidAmoutException e) {
			System.err.println(e.getMessage());
		}
		
		
		System.out.println("Main Ended");
	}
}
