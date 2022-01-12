package com.te.springbean.config;

import org.springframework.stereotype.Component;

import com.te.springbean.Animal;

@Component
public class Dog implements Animal{

	@Override
	public void makeSound() {
		System.out.println("Bow Bow Bow!!!");
		
	}

	@Override
	public void eat() {
		System.out.println("Bow Bow Bow!!!");
		
	}

	@Override
	public boolean isPet() {
		// TODO Auto-generated method stub
		return true;
	}

}
