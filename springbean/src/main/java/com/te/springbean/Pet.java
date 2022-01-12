package com.te.springbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Pet {
	
	String name;
	@Autowired
	@Qualifier("Praveen")
	Animal animal;

	public void doThings() {
		if(animal.isPet()) {
			animal.eat();
			animal.makeSound();
		} else {
			System.out.println("This is not a pet");
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
