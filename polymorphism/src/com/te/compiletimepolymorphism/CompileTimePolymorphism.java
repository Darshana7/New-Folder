package com.te.compiletimepolymorphism;

public class CompileTimePolymorphism {
	
	public int add(int x, int y) {
		return x+y;
	}
	
	public int add(int x, int y, int z) {
		return x+y+z;
	}
	
	public static void main(String[] args) {
		CompileTimePolymorphism obj= new CompileTimePolymorphism();
		System.out.println(obj.add(55,66));
		System.out.println(obj.add(44,55,66));
	}

}
