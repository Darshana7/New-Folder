package com.te.synchronization;

public class Shashi extends Thread {
	
	Printer printer;
	
	public Shashi(Printer printer) {
		super();
		this.printer = printer;
	}

	@Override
	
	public void run() {
		
		for(int i=0; i<=100;i++) {
			printer.printing(25);
		}
		System.out.println("Girlfriend completed depositing");
		
	}
	
}
