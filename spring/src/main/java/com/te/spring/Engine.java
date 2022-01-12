package com.te.spring;

public class Engine implements Garage {

	String name;
	double capacity;

	public void setName(String name) {
		this.name = name;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(name + " Engine Has Started and the Horse Power is " + capacity);
	}

}
