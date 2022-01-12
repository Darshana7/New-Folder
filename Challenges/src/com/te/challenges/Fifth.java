package com.te.challenges;

import java.util.Scanner;

public class Fifth {
	
	static int temp;
	static String printNumberInWords[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" , "other" };

	public static void inWords(int n) {

		if(n<9||n>-9) {
			for (int i=0;i<printNumberInWords.length;i++) {
				if (i==n&&n>0)
					System.out.println(printNumberInWords[i]);
				
				if (-i==n&&n<0)
					System.out.println("Minus " + printNumberInWords[i]);
			}
		} 
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number beteween -9 to 9");
		int n = sc.nextInt();
		inWords(n);
		sc.close();
		
	}

}