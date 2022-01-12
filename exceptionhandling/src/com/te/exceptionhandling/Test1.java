package com.te.exceptionhandling;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		int x; 
		int y;
		System.out.println("Enter the number 1");//60
		Scanner scan = new Scanner(System.in);
		x=scan.nextInt();
		System.out.println("Enter the number 2");//4
		y=scan.nextInt();
		try {
			int result = x/y;//arithematic ex
			int[] arr = new int[result];
			arr[4] = 50;//Array index out of bound
			System.out.println(arr[4]);//50
			System.out.println(result);//15
			System.out.println("End program");
		} catch (ArithmeticException e) {
			System.out.println("Enter valid number");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The size of array is smaller then 4");
		}
		scan.close();
	}
}
