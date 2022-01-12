package com.te.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		list.add(30);
		list.add(50);
		list.add(44);
		list.add(26);
		list.add(49);
		list.remove(2);
		
		Iterator itr= list.iterator(); 
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
	}

}
