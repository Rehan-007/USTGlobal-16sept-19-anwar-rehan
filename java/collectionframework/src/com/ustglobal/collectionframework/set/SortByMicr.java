package com.ustglobal.collectionframework.set;

import java.util.Comparator;

public class SortByMicr implements Comparator<Bank> {

	@Override
	public int compare(Bank o1, Bank o2) {
		
		return ((Long)o1.micr).compareTo((Long)o2.micr);
	}

}
