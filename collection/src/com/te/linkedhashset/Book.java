package com.te.linkedhashset;

public class Book {
	
	int pageNo;
	String author;
	int quantity;
	
	public Book(int pageNo, String author, int quantity) {
		super();
		this.pageNo = pageNo;
		this.author = author;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [pageNo=" + pageNo + ", author=" + author + ", quantity=" + quantity + "]";
	}
	
}
