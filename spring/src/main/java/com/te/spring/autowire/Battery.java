package com.te.spring.autowire;

public class Battery {

		String name ="Toshiba";
		
		public void demo() {
			System.out.println("Heloo guys");
		}

		@Override
		public String toString() {
			return "Battery [name=" + name + "]";
		}
		
}
