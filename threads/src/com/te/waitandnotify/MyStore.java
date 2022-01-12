package com.te.waitandnotify;

public class MyStore {

	public static void main(String[] args) {
		
		UglyFancyStore uglyFancyStore = new UglyFancyStore();
		Ladies yashoda = new Ladies(uglyFancyStore, 15, "Yashoda");
		Ladies rachitha = new Ladies(uglyFancyStore, 4, "Rachitha");
		Ladies darshana = new Ladies(uglyFancyStore, 10, "Darshana");
		Supplier yashwanth = new Supplier(uglyFancyStore, 20);
		
		yashoda.start();
		rachitha.start();
		darshana.start();
		yashwanth.start();
		
	}

}
