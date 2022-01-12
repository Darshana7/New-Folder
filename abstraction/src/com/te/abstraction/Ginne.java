package com.te.abstraction;

public class Ginne extends Dog {
	public Ginne(double weight, int nails, String breed) {
	super(weight,nails,breed);
	}
	public void bark() {
		System.out.println("Bow Bow");	
	}
	
	void eat() {
		System.out.println("Pedigree and chicken");	
	}
	
	void bite() {
		System.out.println("It shows teeth");	
	}
}
