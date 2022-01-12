package com.te.springbean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springbean.Pet;

@Configuration
public class Config {
	
	@Bean("Dog")
	public Dog getDog() {
		return new  Dog();
	}
	
	@Bean("Praveen")
	@Primary
	public Praveen getPraveen() {
		return new Praveen();
	}
	
	@Bean("Yashwanth")
	public Yashwanth getYashwanth() {
		return new Yashwanth();
	}
	
	@Bean("Pet")
	public Pet getPet() {
		return new Pet();
	}

}
