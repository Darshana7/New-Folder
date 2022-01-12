package com.te.springbean.config;

import org.springframework.stereotype.Component;

import com.te.springbean.Animal;

@Component
public class Praveen implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Hurraaggahh");
		
	}

	@Override
	public void eat() {
		System.out.println("Food");
		
	}

	@Override
	public boolean isPet() {
		// TODO Auto-generated method stub
		return false;
	}

}
