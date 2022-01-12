package com.te.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Salary {
	
	@Autowired
	MockRating mockRating;

	@Override
	public String toString() {
		return "Salary [mockRating=" + mockRating + "]";
	}

}
