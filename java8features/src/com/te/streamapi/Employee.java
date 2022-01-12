package com.te.streamapi;

public class Employee {
	int empId;
	String name;
	double salary;
	String designation;
	int age;
	
	public Employee(int empId, String name, double salary, String designation, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.age = age;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", age=" + age + "]";
	}
	
	
}
