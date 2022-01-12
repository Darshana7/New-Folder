package com.te.customexception;

public class Custom {
	public static void happen() throws Blocked{
		System.out.println("Hello, Kutti");
		throw new Blocked("You are not eligible");
	}
	public static void main(String[] args) {
		Custom custom=new Custom();
		try {
			Custom.happen();
		} catch (Blocked e) {
			System.out.println(e.message);
		}
	}
}
