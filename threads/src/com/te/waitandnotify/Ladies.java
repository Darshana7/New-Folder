package com.te.waitandnotify;

public class Ladies extends Thread {
	
	UglyFancyStore fancyStore;
	int number;
	String name;
	
	public Ladies(UglyFancyStore fancyStore, int number, String name) {
		super();
		this.fancyStore = fancyStore;
		this.number = number;
		this.name = name;
	}
	@Override
	public void run() {
		fancyStore.buy(number, name);
	}
}
