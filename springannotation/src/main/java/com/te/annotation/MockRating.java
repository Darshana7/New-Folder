package com.te.annotation;

import org.springframework.beans.factory.annotation.Value;

public class MockRating {
	
	@Value("Good")
	String rating;
	@Value("85")
	int theory;
	@Value("75")
	int practical;
	
	public void setRating(String rating) {
		this.rating = rating;
	}
	public void setTheory(int theory) {
		this.theory = theory;
	}
	public void setPractical(int practical) {
		this.practical = practical;
	}
	
	@Override
	public String toString() {
		return "MockRating [rating=" + rating + ", theory=" + theory + ", practical=" + practical + "]";
	}
	
}
