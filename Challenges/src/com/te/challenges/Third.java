package com.te.challenges;

import java.util.Scanner;

public class Third {
	void method(int a, int b, int c) {
		if (a < 1 || b < 1 || c < 1)
			System.out.println("Invalid value");
		else if (a == b && a == c && b == c)
			System.out.println("All numbers are equal");
		else if (a != b && a != c && c != b)
			System.out.println("All numbers are different");
		else
			System.out.println("Neither all are equal or different");
	}

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		Third ch = new Third();
		System.out.println("Enter three number");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		ch.method(a, b, c);
	}

}
