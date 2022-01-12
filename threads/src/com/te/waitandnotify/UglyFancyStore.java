package com.te.waitandnotify;

public class UglyFancyStore {
	
	int lipstick=10;
	
	public synchronized void buy(int noOfLipstick, String name) {
		
		if (lipstick<noOfLipstick) {
			System.out.println("Supplier will be here!!! please wait");
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		lipstick-=noOfLipstick;
		System.out.println("Here comes your lipstick : " +name + "Lipsticks left :"+ lipstick);
		System.out.println("===============");
	}
	
	public synchronized void restock(int noOfLipstick) {
		lipstick+=noOfLipstick;
		System.out.println("The number of lipstick available : " +lipstick);
		notify();
		System.out.println("===============");
	}
}
