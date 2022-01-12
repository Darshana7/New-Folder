package com.te.practice;

import java.util.*;

public class ArrayListProgram {
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student st1= new Student(1,"Sonal",16);
		Student st2= new Student(2,"Sushil",15);
		Student st3= new Student(3,"Sukriti",20);
		Student st4= new Student(4,"Sonal",20);
		Student st5= new Student(5,"Sushil",15);
		
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
//		System.out.println(list);
		
		Iterator<Student> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		HashSet<Student> set = new HashSet<Student>(list);
		System.out.println(set);
	}

}
