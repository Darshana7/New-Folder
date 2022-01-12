package com.te.challenges;

import java.util.Scanner;

public class Fourth {
	boolean isCatplaying(boolean summer, int temperature) {
		if (summer == false && temperature >= 25 && temperature <= 35)
			return true;
		else if (summer == true && temperature >= 25 && temperature <= 45)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String d;
		int temperature;
		Scanner sc = new Scanner(System.in);
		Fourth c = new Fourth();
		System.out.println("Is it summer");
		d = sc.next();
		System.out.println("Enter the temperature");
		temperature = sc.nextInt();
		boolean t = Boolean.parseBoolean(d);
		System.out.println("Is cat playing: " + c.isCatplaying(t, temperature));
		sc.close();
	}
	

}