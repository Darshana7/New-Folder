package com.te.treeset;

import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSea {
	public static void main(String[] args) {
		TreeSet treeSet=new TreeSet();
		treeSet.add(-5);
		treeSet.add(10);
		treeSet.add(80);
		treeSet.add(6);
		treeSet.add(99);
		treeSet.add(5);
		for(Object obj : treeSet) {
			System.out.println(obj);
		}
		System.out.println("=========");
		ArrayList arrayList = new ArrayList<>(treeSet);
		ListIterator<Integer> listIterator=arrayList.listIterator(arrayList.size());
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());//list itr
		}
	}
}
