package com.technoelevate.abstractclass.loosecoupling;

public class Driver {
	public void drive(Car car) {
		car.start();
		car.accelerate();
		car.brake();
	}
}
