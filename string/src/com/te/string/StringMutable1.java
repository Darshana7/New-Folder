package com.te.string;

public class StringMutable1 {
	public static void main(String[] args) {
		StringBuilder sbd =new StringBuilder("Dee");
		sbd.append(" Mistary");
		String str1="Darshana";
		String str="Nilesh";
		System.out.println(sbd);
		System.out.println(sbd.delete(8, 10));
		System.out.println(sbd.length());
		System.out.println(str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.indexOf('s'));
		System.out.println(str1.concat(str));
		System.out.println(str1.charAt(4));
		System.out.println(str1.hashCode());
		System.out.println(str1.replace(sbd, str1));
		
	}

}
