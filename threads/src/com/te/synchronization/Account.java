package com.te.synchronization;

public class Account {
	
	int balance;
	
	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public void withdraw(int amount) {
		
		if(balance<amount) {
			System.out.println("Insufficient balance");
		} else {
			balance-=amount;			
		}
	}
	
	synchronized public void deposit(int amount) {
		balance+=amount;
			
	}
	
	public void checkBalance() {
		System.out.println(balance);
	}

}
