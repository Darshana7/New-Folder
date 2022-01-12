package com.te.synchronization;

public class Praveen extends Thread {
	
	Printer printer;
	
	public Praveen(Printer printer) {
		super();
		this.printer = printer;
	}

	@Override
	
	public void run() {
		
		for(int i=0; i<=100;i++) {
			printer.printing(75);
			}
		
	}
	
}
