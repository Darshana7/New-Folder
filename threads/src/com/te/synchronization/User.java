package com.te.synchronization;

public class User {
	
	int page;
	
	public User(int page) {
		super();
		this.page = page;
	}

	synchronized public void printing(int pageNo) {
		page+=pageNo;
		System.out.println(pageNo);
		
	}

}
