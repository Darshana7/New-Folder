package com.technoelevate.tables;

public class Exercise1 {

	public static void main(String[] args) {
		int i=1;
		for(System.out.println("K");i<5;System.out.println("KT")) {
			System.out.println("V");
			i++;//if i<5 is replaced by true than op K (KT V in infinite loop) 
		}

	}

}
