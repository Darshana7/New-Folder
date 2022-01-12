package com.te.hibernate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class DesiDaru {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "Brand")
	private String name;
	
	private double price;
	
	@Column(nullable = false)
	private String quantity;
	
	

}
