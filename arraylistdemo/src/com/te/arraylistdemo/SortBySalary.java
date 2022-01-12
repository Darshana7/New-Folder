package com.te.arraylistdemo;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {
	public int compare(Employee o1, Employee o2) {
		return (int)(o1.salary-o2.salary);
	}

}