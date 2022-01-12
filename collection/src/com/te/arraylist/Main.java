package com.te.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.remove(2);	
		Iterator iterator=list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//		System.out.println(list);
//		System.out.println();
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));//4 gives ArrayIndexOutOfBoundException
//	
		}

}
