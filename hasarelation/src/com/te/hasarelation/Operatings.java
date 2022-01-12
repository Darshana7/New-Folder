package com.te.hasarelation;

public class Operatings {
	String brand;
	int size;
	double bit;
	public Operatings(String brand, int size, double bit) {
		super();
		this.brand = brand;
		this.size = size;
		this.bit = bit;
	}
	@Override
	public String toString() {
		return "Operatings [brand=" + brand + ", size=" + size + ", bit=" + bit + "]";
	}
	
}
