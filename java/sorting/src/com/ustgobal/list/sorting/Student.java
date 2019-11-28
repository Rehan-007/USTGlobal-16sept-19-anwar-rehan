package com.ustgobal.list.sorting;


public class Student implements Comparable<Student> {

	int id;
	String name;
	double perce;
	
	public Student(int id, String name, double perce) {
		super();
		this.id = id;
		this.name = name;
		this.perce = perce;
	}
	

	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", perce=" + perce + "]";
	}



//	@Override
//	public int compareTo(Student s) {
//		
//		Integer i = this.id;
//		Integer j = s.id;
//		
//		return i.compareTo(j);
//	}
	
	@Override
	public int compareTo(Student s) {
		
		Double i = this.perce;
		Double j = s.perce;
		
		return i.compareTo(j);
	}



//	@Override
//	public int compareTo(Student s) {
//		
//	    String name  = this.name;
//	    String n = name.toUpperCase();
//		return this.name.compareTo(n);
//	}



//	@Override
//	public int compareTo(Student s) {
//		
//		if(this.perce > s.perce) {
//			return 1;
//		} else if(this.perce < s.perce) {
//			return -1;
//		} else {
//			return 0;
//		}
//	}


    // uses TimSort -for Ascending Order

	
	
}
