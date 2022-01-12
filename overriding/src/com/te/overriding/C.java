package com.te.overriding;

public class C {
	public static void main(String[] args) {
		B.b=new B();
		System.out.println(B.display());
	}
}
