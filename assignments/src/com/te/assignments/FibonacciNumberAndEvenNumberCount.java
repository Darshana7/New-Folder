package com.te.assignments;

public class FibonacciNumberAndEvenNumberCount {
	public static void main(String args[])  
	{    
	 int n1=0,n2=1;
	 int count=12;    
	 System.out.println(n1+n2);   
	    
	 for(int i=2;i<=count;++i)  
	 {    
	  int n3=n1+n2;    
	  System.out.println(n3);    
	  n1=n2;    
	  n2=n3;    
	 } 
	 // Even number count   
	 int n4 = 100, n5=500, count1 = 0, iteration=0;
	 for (int i=n4; i<=n5; i++) {
		if (i%2==0) {
			count1++;
			iteration++;
		}
	 }
	 System.out.println("There are "+count1+ " Even numbers between "+ n4+ " and " +n5);
	 System.out.println("No.of Iterations is " +iteration);
	}
}
