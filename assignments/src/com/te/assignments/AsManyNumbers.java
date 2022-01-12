package com.te.assignments;

public class AsManyNumbers { 
	
	public static int add(int...x) {
		int result=0;
		
		for(int i=0; i<x.length;i++) {
			result=result+x[i];
					
		}
		return result;
	}
	
	public static void main(String[] args) {
		int sum=add(68,45,98,12,66);
		System.out.println(sum);
	}

}
