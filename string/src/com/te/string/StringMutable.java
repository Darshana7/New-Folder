package com.te.string;

//StringBuffer

public class StringMutable {

	public static void main(String[] args) {
		StringBuffer sbf =new StringBuffer("Dee");
		sbf.append(" Mistary");
		String str1="Darshana";
		String str="Nilesh";
		System.out.println(sbf);
		System.out.println(sbf.delete(8, 10));
		System.out.println(sbf.reverse());
		System.out.println(sbf.length());
		System.out.println(str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.indexOf('s'));
		System.out.println(str1.concat(str));
		System.out.println(str1.charAt(4));
		System.out.println(str1.hashCode());
		System.out.println(str.hashCode());
		System.out.println(str.equals("Darshana"));
		System.out.println(str1.replace(str1, sbf));
	}
}