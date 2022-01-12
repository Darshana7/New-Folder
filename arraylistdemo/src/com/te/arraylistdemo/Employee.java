package com.te.arraylistdemo;

//tostring needs to be overidden it will not give ref instead op
//overide tostring to give the particular data of the variable

public class Employee {
	int empId;
	String name;
	double salary;
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public int compareTo(Employee o) {
		return 
	}
	
	

}
