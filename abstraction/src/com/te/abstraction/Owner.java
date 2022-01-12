package com.te.abstraction;

public class Owner {
	public static void main(String[] args) {
		Rocky rocky= new Rocky(40.12, 20, Labroder);
		rocky.bark();
		rocky.eat();
		rocky.bite();
		rocky.poop();

		System.out.println("==============");
		
		Ginne ginne=new Ginne();
		ginne.bark();
		ginne.eat();
		ginne.bite();
		ginne.poop();
		
	}

}
