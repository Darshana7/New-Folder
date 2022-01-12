package com.te.springbean.config;

import org.springframework.stereotype.Component;

import com.te.springbean.Animal;

@Component
public class Yashwanth implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Errrrrggghhhh");
		
	}

	@Override
	public void eat() {
		System.out.println("Brains!!!");
		
	}

	@Override
	public boolean isPet() {
		// TODO Auto-generated method stub
		return false;
	}

}
