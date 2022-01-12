package com.technoelevate.java;

public class A {
 void run(){
	System.out.println("running");
}
 void jump(){
	 System.out.println("jump");
 }
 public static void main(String[] args) {
	A var = new A();
	var.run();
	A in = new A();
	in.jump();
}
}
