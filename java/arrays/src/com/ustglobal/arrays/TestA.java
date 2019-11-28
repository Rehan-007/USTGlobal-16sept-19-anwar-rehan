package com.ustglobal.arrays;

public class TestA {

	public static void main(String[] args) {
		
		int[] num=new int[5];
		
		num[0]=12;
		num[1]=13;
		num[2]=14;
		num[3]=15;
		num[4]=16;
//		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
//		
		for(int n : num) {
			
			System.out.println(n);
		}
		
		char[] ch= {'A','B','C','D','E'};
		for(char i: ch) {
			System.out.println(i);
		}
		
		byte[] b= {1,2,3,4,5};
		for(byte i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		for(byte v : b) {
			System.out.println(v);
		}
		
		double[] d= {36.36,34.36,69.69,77.4,69.4};
		
		for(int j=0;j<d.length;j++) {
			System.out.println(d[j]);
		}
		
		for(double j : d) {
			System.out.println(j);
		}
		
		String[] s= {"Rehan","Anu","Om","teju"};
		for(int i=0;i< s.length;i++) {
			System.out.println(s[i]);
		}
	}
}
