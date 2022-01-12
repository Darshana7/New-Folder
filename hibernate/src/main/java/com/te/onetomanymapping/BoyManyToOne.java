package com.te.onetomanymapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class BoyManyToOne {
	 
	@Id
	private int bid;
	 
	private String name;
	 
	private double balance;
	 
	@ManyToOne
	private GirlOneToMany girl;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public GirlOneToMany getGirl() {
		return girl;
	}

	public void setGirl(GirlOneToMany g) {
		this.girl = g;
	}

}
