package com.ustglobal.collectionframework.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestBank {

	public static void main(String[] args) {
		
		
		SortByName sn = new SortByName();
		SortByPincode sp = new SortByPincode();
		SortByMicr sb = new SortByMicr();
		TreeSet<Bank> t = new TreeSet<>(sp);
		
		Bank b1 = new Bank("SBI", 4484, 456779);
		Bank b2 = new Bank("Canara", 4464, 4567589);
		Bank b3 = new Bank("HDFC", 4224, 41283779);
		Bank b4 = new Bank("Citi", 2284, 445879679);
		Bank b5 = new Bank("SBI", 4484, 456779);


        t.add(b1);
        t.add(b2);
        t.add(b3);
        t.add(b4);
        t.add(b5);
        
        
        
        System.out.println("=================Using Iterator==================");
        Iterator<Bank> i = t.iterator();
        while(i.hasNext()) {
        	Bank b = i.next();
        	System.out.println("Bank name is = "+b.name);
        	System.out.println("PIncode is = "+b.pincode);
        	System.out.println("Micr code is= "+b.micr);
        	System.out.println("----------------------------------");
        }
		
	}
}
