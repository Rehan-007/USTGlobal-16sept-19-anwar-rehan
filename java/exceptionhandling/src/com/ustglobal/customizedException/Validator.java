package com.ustglobal.customizedException;

public class Validator {

	void verify(int age) {
		if(age < 18) {
			throw new InvalidAgeException("Immature Piece Of Shit");
		}
	}
}
