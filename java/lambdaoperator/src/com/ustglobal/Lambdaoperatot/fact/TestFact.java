package com.ustglobal.Lambdaoperatot.fact;

public class TestFact {

	public static void main(String[] args) {
		
		Factorial fi = (n) -> {
			int fact = 1;
			for(int i=2; i<=n ; i++) {
				fact =fact*i;
			}
			return n;
		};
	}
}
