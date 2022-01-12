package com.te.arraypractice;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		int n=565;
		int rem;
		int sum =0;
		int temp=n;
		while(n>0) {
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
//		System.out.println(sum);
		if(temp==sum) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("not palindrome");
		}
		
	}

}
