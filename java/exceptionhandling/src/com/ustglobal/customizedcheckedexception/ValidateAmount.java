package com.ustglobal.customizedcheckedexception;

public class ValidateAmount {

	void checkAmount(int amount) throws InvalidAmoutException {
		
		if(amount > 40000) {
			throw new InvalidAmoutException();
		}
	}
}
