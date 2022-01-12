package com.te.linkedhashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

import com.te.hashset.SortByName;
import com.te.hashset.Student;

public class Topic {
	
	public static void main(String[] args) {
		LinkedHashSet<Book> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(new Book(11, "Anup Goel" , 100));
		linkedHashSet.add(new Book(359, "R. K. Narayan" , 59));
		linkedHashSet.add(new Book(121, "Rabindranath Tagore", 64));
		
		Iterator<Book> iterator = linkedHashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		System.out.println("Sort By PageNo");
		ArrayList<Book> arrayList = new ArrayList(linkedHashSet);
		Collections.sort(arrayList,new SortByPageNo());
		Iterator<Book> iterator2 = arrayList.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		System.out.println();
		System.out.println("Sort By Quantity");
		Collections.sort(arrayList,new SortByQuantity());
		Iterator<Book> iterator3 = arrayList.iterator();
		while(iterator3.hasNext()) {
			System.out.println(iterator3.next());
		}
		
		System.out.println();
		System.out.println("Sort By Author");
		Collections.sort(arrayList,new SortByAuthor());
		Iterator<Book> iterator4 = arrayList.iterator();
		while(iterator4.hasNext()) {
			System.out.println(iterator4.next());
		}
		
		}

	}
