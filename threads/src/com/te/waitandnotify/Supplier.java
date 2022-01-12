package com.te.waitandnotify;

public class Supplier extends Thread {
	
	UglyFancyStore fancyStore;
	int number;
	
	
	public Supplier(UglyFancyStore fancyStore, int number) {
		this.fancyStore = fancyStore;
		this.number = number;
	}

	@Override
	public void run() {
		fancyStore.restock(number);
	}

}
