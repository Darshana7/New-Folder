package com.te.string;

public class Test {
	public static void main(String[] args) {
		String name="My name is Shubh";
		String s="My name is Shubh";
		System.out.println(name==s);
		String name2="My name is Shubh";
		String s2=new String("My name is Shubh");
		System.out.println(name2==s2);
		name=name.toUpperCase();
		System.out.println(name);
		String[] s1=name.split("S",2);//" "the character in quotes helped to delete the char n print remaining at instance n is case sensitive
		for (String x : s1) {
			System.out.println(x);
		}
	}
}
