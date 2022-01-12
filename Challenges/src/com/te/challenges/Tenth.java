package com.te.challenges;

import java.util.Scanner;

public class Tenth {
	static boolean hasSharedDigit(int number1, int number2) {
		if (number1 >10&&number1<99&&number2>10&&number2<99) {
			int a= number1 / 10;
			int b= number1 % 10;
			int x= number2 / 10;
			int y= number2 % 10;
			if (x == a || x == b || y == a || y == b)
				return true;
			else
				return false;
		} else
			return false;
	}

	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println(hasSharedDigit(num1, num2));
		sc.close();

	}

}
