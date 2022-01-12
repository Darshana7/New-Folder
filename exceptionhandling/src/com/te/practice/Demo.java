package com.te.practice;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no.");
		int n1=sc.nextInt();
		System.out.println("Enter second no.");
		int n2=sc.nextInt();
		int x=0;
		int a[]=new int[4];
		
		try {
		x=n1/n2;
		for (int i = 0; i <=4; i++) {
			
			a[i]=i+1;
			
		}
		for(int value:a) {
			System.out.println(value);
		}
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Maximum number of value is 4");
		
		}

	}

}
