package com.te.linkedhashset;

import java.util.Comparator;

public class SortByQuantity implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.quantity-o2.quantity;
		
	}

}
