package com.te.prac;

import java.util.Scanner;

public class PrimeNum {
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the element");
		 int n=sc.nextInt();
		 int x=0;
		 for(int i=1; i<=n;i++) {
			 if(n%i==0) {
				 x++;
			 }
		 }
		 if(x>2) {
			 System.out.println(n+ " is not a prime no");
		 } else {
			 System.out.println(n+ " is a prime");
		 } 
	}

}
