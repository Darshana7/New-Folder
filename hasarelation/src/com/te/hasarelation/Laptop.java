package com.te.hasarelation;

public class Laptop {
	double cost;
	Battery battery;
	private Operatings os;
	private HardDisk hardDisk;
	private Processor processor;
	public Laptop(double cost, Battery battery, Operatings os, HardDisk hardDisk, Processor processor) {
		super();
		this.cost=cost;
		this.battery=battery;
		this.hardDisk=hardDisk;
	}

}
