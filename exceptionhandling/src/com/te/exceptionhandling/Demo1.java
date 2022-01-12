package com.te.exceptionhandling;

public class Demo1 {
	public static void m1() {
		System.out.println("From m1");
		m1();
	}
	public static void main(String[] args) {
		m1();
	}
}
