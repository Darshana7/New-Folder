package com.te.Interface;

public class Abstraction {
	 public static void main(String args[]) {
	      Person person1 = new Student();
	      person1.display();
	      Person person2 = new Lecturer();
	      person2.display();
	 }
}