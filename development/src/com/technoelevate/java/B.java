package com.technoelevate.java;

public class B extends A {
    void run(){
    	System.out.println("runnable");
    	super.run();
    }
    public static void main(String[] args) {
		B in = new B();
	    in.run();
	}
}
