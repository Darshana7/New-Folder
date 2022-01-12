package com.te.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class CalculatorTest {
	
	Calculator calculator;
	
	@BeforeAll
	void beforeAll() {
		System.out.println("Before all");
	}
	
	@BeforeEach
	void init() {
		calculator  = new Calculator();
		System.out.println("New Instance created");
		
	}
	
	@AfterEach
	void afterCalculation() {
		System.out.println("Process Completed");
	}
	
	@Test
	@DisplayName("Addition")
	void additionTest() {
		assertEquals(7, calculator.add(5, 2));
		System.out.println("Addition completed");
	}
	
	@Test
	@DisplayName("Multiplication")
	void multiplicatonTest() {
		assertEquals(21, calculator.multiplication(3, 7));
		System.out.println("Multipilication completed");
	}
	
	@Test
	@DisplayName("Area of Circle") 
	void areaOfCircleTest() {
		assertEquals(314.1592653589793, calculator.areaOfCircle(10));
		System.out.println("Area of circle displayed");
	}
	
//	@Test
//	void division() {
//		assertThrows(ArithmeticException.class, ()->calculator.division(10, 5));
//	}

}
