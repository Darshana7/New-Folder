package com.te.spring;

public class Car {
	Garage e;
	String name;

//	public Car(Garage e, String name) {
//		super();
//		this.e = e;
//		this.name = name;
//	}

	public void setE(Garage e) {
		this.e = e;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void move() {
		e.start();
		System.out.println(name + " Car Is Moving");
	}
}
