package com.te.arraypractice;

public class Palindrome {
	public static void main(String[] args) {
		String str="MoM";//MoM level level Level leveL
		String rev="";
		for (int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome " +rev);
		}
	}
}
