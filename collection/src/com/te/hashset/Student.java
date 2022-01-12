package com.te.hashset;

public class Student {

	int rollNo;
	String name;
	int marks;

	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

	//// equals on name
	// @Override
	// public int hashCode() {
	// final int prime = 31;
	// int result = 1;
	// result = prime * result + ((name == null) ? 0 : name.hashCode());
	// return result;
	// }
	//
	// @Override
	// public boolean equals(Object obj) {
	// if (this == obj)
	// return true;
	// if (obj == null)
	// return false;
	// if (getClass() != obj.getClass())
	// return false;
	// Student other = (Student) obj;
	// if (name == null) {
	// if (other.name != null)
	// return false;
	// } else if (!name.equals(other.name))
	// return false;
	// return true;
	// }

	
	////equals on marks
	// @Override
	// public int hashCode() {
	// final int prime = 31;
	// int result = 1;
	// result = prime * result + marks;
	// return result;
	// }
	//
	// @Override
	// public boolean equals(Object obj) {
	// if (this == obj)
	// return true;
	// if (obj == null)
	// return false;
	// if (getClass() != obj.getClass())
	// return false;
	// Student other = (Student) obj;
	// if (marks != other.marks)
	// return false;
	// return true;
	// }
	//
	//
	
	//equals on rollNo
	 @Override
	 public int hashCode() {
	 final int prime = 31;
	 int result = 1;
	 result = prime * result + rollNo;
	 return result;
	 }
	
	

	 @Override
	 public boolean equals(Object obj) {
	 if (this == obj)
	 return true;
	 if (obj == null)
	 return false;
	 if (getClass() != obj.getClass())
	 return false;
	 Student other = (Student) obj;
	 if (rollNo != other.rollNo)
	 return false;
	 return true;
	 }
	

}
