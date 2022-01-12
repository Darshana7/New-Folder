package com.te.throwdemo;

public class ThrowsDemo {
	public void bhushan() throws Exception {
		System.out.println("I did not do it");
		throw new Exception();
	}
	public static void main(String[] args) {
		System.out.println("Who has done it?");
		ThrowDemo td = new ThrowDemo();
		try {
			td.bhushan();
		} catch (Exception e) {
			System.out.println("Exception occured");
		}	
	}
}
