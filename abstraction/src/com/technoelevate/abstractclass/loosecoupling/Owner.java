package com.technoelevate.abstractclass.loosecoupling;

public class Owner {

	public static void main(String[] args) {
		Driver d = new Driver();
		d.drive(new RollsRoyce());
		d.drive(new Audi());
	}
}
