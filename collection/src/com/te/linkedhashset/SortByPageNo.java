package com.te.linkedhashset;

import java.util.Comparator;

public class SortByPageNo implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
	
		return o1.pageNo-o2.pageNo;
	}
	
	

}
