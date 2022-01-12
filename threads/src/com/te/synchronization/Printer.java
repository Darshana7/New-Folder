package com.te.synchronization;

public class Printer {
	
	int page;
	
	public Printer(int page) {
		super();
		this.page = page;
	}

	synchronized public void printing(int pageNo) {
		page+=pageNo;
		System.out.println(pageNo);
		
	}

}
