package com.te.string;

public class ReverseAString {
	
	public static void main(String[] args) {
		
		String s="Dream Big";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		
		System.out.println("Original String: "+s);
		System.out.println("Reversed String: "+rev);	
	}
      
}
