package com.te.overriding;

public class Main {

	public static void main(String[] args) {
		Test2 test2=new Test2();
		test2.m1();
		
		/*
		 * Upcasting - changing the child class object to
		 */
		Test t=new Test2();
		t.m1();
		//Downcasting
		Test2 t2 =(Test2) t;
		t2.m2();
		
		/*Test t =new Test();
		t.m1();*/
	}
}
