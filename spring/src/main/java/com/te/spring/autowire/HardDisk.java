package com.te.spring.autowire;

public class HardDisk {
	
	String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "HardDisk [name=" + name + "]";
	}
	
}
