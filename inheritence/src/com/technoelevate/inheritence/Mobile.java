package com.technoelevate.inheritence;

public class Mobile {

	public static void main(String[] args) {
		Phone phone= new Phone();
		phone.cost=1200;
		phone.color="Hot pink";
		phone.sim=2;
		phone.brand="Kochidan";
		System.out.println(phone.cost);
		System.out.println(phone.color);
		System.out.println(phone.sim);
		System.out.println(phone.brand);
		phone.call();
		phone.text();
		SmartPhone smartPhone= new SmartPhone();
		smartPhone.cost=12000;
		smartPhone.brand="Samsung";
		smartPhone.color="Orange";
		smartPhone.sim=2;
		System.out.println(smartPhone.cost);
		System.out.println(smartPhone.brand);
		System.out.println(smartPhone.color);
		System.out.println(smartPhone.sim);
	}
}
