package com.te.prac;

public class ReverseEveryWordOfArray {

	public static void main(String[] args) {
		
		String name="Hii How Are You";
		String reverse="";
		String[] array=name.split(" ");
		
		for(int i=0;i<array.length;i++) {
			String word=array[i];
			for(int j=word.length()-1;j>=0;j--) {
				reverse=reverse+word.charAt(j);
			}
			reverse=reverse+" ";
		}
		System.out.println(reverse);
	}
}
