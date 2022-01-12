package com.te.challenges;

import java.util.Scanner;

public class Second {
	
	static int area;

	public double area(double radius) {
		if (radius < 1)
			return -1.0;
		else
			return Math.PI * radius * radius;
	}

	public double area(double length, double width) {
		if ((length < 1) || (width < 1))
			return -1.0;
		else
			return length * width;
	}

	public static void main(String[] args) {
		String str;
		double radius;
		double length;
		double width;
		Scanner sc = new Scanner(System.in);
		Second a = new Second();
		System.out.println("Enter the shape for which area needs to be found");
		str = sc.next();
		switch (str) {
		
		case "circle": {
			System.out.println("Enter the radius");
			radius = sc.nextDouble();
			System.out.println("Area: " + a.area(radius));
			break;
		}
		
		case "rectangle": {
			System.out.println("Enter length and width");
			length = sc.nextDouble();
			width = sc.nextDouble();
			System.out.println("Area: " + a.area(length, width));
			break;
		}
		
		default:
			System.out.println("Invalid shape");
		}
		sc.close();

	}
}

