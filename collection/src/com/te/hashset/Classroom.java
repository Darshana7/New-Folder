package com.te.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Classroom {
	
	public static void main(String[] args) {
		
		HashSet<Student> hashSet = new HashSet();
		hashSet.add(new Student(22, "Bhushan", 75));
		hashSet.add(new Student(55, "Kratika", 80));
		hashSet.add(new Student(88, "Wasim", 90));
		hashSet.add(new Student(77, "Yashoda", 66));
		hashSet.add(new Student(7, "Anurag", 77));
		hashSet.add(new Student(7, "Dev", 92)); //rollNo repeated
		hashSet.add(new Student(5, "Darshana", 66)); //marks repeated
		hashSet.add(new Student(9, "Anurag", 82)); //name repeated
		
		Iterator<Student> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		System.out.println("Sort By Name");
		ArrayList<Student> arrayList = new ArrayList(hashSet);
		Collections.sort(arrayList,new SortByName());
		Iterator<Student> iterator2 = arrayList.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		System.out.println();
		System.out.println("Sort By Marks");
		Collections.sort(arrayList, new SortByMarks());
		Iterator<Student> iterator3 = arrayList.iterator();
		while(iterator3.hasNext()) {
			System.out.println(iterator3.next());
		}
		
		System.out.println();
		System.out.println("Sort By RollNo.");
		Collections.sort(arrayList, new SortByRollNo());
		Iterator<Student> iterator4 = arrayList.iterator();
		while(iterator4.hasNext()) {
			System.out.println(iterator4.next());
		}
	}
}
