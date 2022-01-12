package com.technoelevate.looseCoupling;

public class LooseCoupling {
	public static void main(String[] args) {
		Developer d=new Developer();
		d.develop(new Instagram());
		d.develop(new Whatsapp());
	}
}
