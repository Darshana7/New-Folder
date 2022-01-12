package com.te.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(40);
		hashSet.add(50);
//		System.out.println(hashSet.add(60));
//		System.out.println(hashSet.add(20));
		for (Integer x: hashSet) {
			System.out.println(x);
		}
		System.out.println("===================");
		Iterator iterator=hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
