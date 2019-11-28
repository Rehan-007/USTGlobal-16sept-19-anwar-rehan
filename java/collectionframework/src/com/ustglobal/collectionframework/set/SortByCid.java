package com.ustglobal.collectionframework.set;

import java.util.Comparator;

public class SortByCid implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return ((Integer)o1.id).compareTo((Integer)o2.id);
	}

}
