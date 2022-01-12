package com.technoelevate.quadratic;

import java.util.Scanner;
public class Quadratic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a: ");
		double a=sc.nextDouble();
		System.out.println("Enter b: ");
		double b=sc.nextDouble();
		System.out.println("Enter c: ");
		double c=sc.nextDouble();
		d=b*b-4*a*c;
		if(d>0)
		{
			r1=-b+Math.sqrt(d)/2*a;
			r2=-b-Math.sqrt(d)/2*a;
			System.out.println("Roots are real and distinct");
		}
		
	}

}
