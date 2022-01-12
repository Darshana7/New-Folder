package com.technoelevate.tables;

import java.util.Scanner;
public class Progression {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		int c=sc.nextInt();
		double sum=a+Math.pow(2,0)*b;
		System.out.println(sum);
		for(int i=1;i<=c;i++) {
			sum=+Math.pow(2,i)*b;
			System.out.println(sum);
		}
	}
}
