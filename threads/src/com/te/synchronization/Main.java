package com.te.synchronization;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Account account = new Account(1000);
		BoyFriend boyFriend = new BoyFriend(account);
		GirlFriend girlFriend = new GirlFriend(account);
		
		boyFriend.start();
		girlFriend.start();
		
		boyFriend.join();
		girlFriend.join();
		
		System.out.println("Wait completed");
		account.checkBalance();
	
	}

}
