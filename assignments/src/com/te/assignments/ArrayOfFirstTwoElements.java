package com.te.assignments;

import java.util.Scanner;

public class ArrayOfFirstTwoElements {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of array");
		
		int a=scanner.nextInt();
		System.out.println("Enter elements of array");
		
		int arr []=new int[a];
		
		for(int i=0; i<=arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		
		if(arr.length>2) {
			System.out.println(arr[0]+"");
			System.out.println(arr[1]);
		}
		
		else {
			System.out.println(arr[0]);
		}
		
	}

}
