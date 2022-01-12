package com.te.assignments;

import java.util.Scanner;

public class ArrayOfExact3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		

		int a = scanner.nextInt();
		System.out.println("Enter elements of array");
		
		int arr[]=new int[a]; 
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		
		int count=0;
		
		for(int i=0;i<arr.length;i++) {

			if(arr[i]==3 || arr[i+1]==3) {
				count++;
			}
		}
		if(count==3) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
