package com.ustglobal.collectionframework.set;

import java.util.Comparator;

public class SortByPincode implements Comparator<Bank> {

	@Override
	public int compare(Bank o1, Bank o2) {
		
		return ((Integer)o1.pincode).compareTo((Integer)o2.pincode);
	}

}
