package com.te.prac;

public class ReverseArray {
	
	public static void main(String[] args) {
	String aa = "this is my";
	char array [] = aa.toCharArray();
	char array1[] = new char[array.length];
	for (int i = 0; i < array.length/2; i++) {
		if (array[i]!=0){
		char c = array[i];
		array[i] = array[array.length-1-i];
		array[array.length-1-i]=c;
		}
	}for (int i = 0; i < array.length; i++) {
	
	}
	String result = new String (array);
	System.out.println(result);
	}
}
