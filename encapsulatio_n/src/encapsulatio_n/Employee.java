package encapsulatio_n;

public class Employee {
	private int empId;
	private int age;
	private String name;
	private String designation;
	
	public void setAge(int age) {
		if (age >0 && age<100) {
			this.age=age;
		}
		else {
			System.out.println("Foolish guy dont test me");
		}
	}
	public void getAge() {
		System.out.println(age);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getName() {
		System.out.println(name);
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public void getDesignation() {
		System.out.println(designation);
	}
	}