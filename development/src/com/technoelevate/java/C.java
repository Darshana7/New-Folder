package com.technoelevate.java;

public class C extends A {
	void play(){
		System.out.println("playing...");
		super.run();
	}
	public static void main(String[] args) {
		C in = new C();
	    in.play();
}
}
