package com.te.prac;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		String str="Level";
		String rev="";
		
		for (int i = str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		
		if(rev.equalsIgnoreCase(str)) {
			System.out.println(str+ " is a palindrome");
		} else {
			System.out.println(str+ " is not a palindrome");
		}
		
		if(rev.equals(str)) {
			System.out.println(str+ " is a palindrome");
		} else {
			System.out.println(str+ " is not a palindrome");
		}
			
	}

}
	