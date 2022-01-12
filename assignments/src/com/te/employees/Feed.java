package com.te.employees;

public class Feed {

	public static void main(String[] args) {
		Extract e = new Extract();
		Intern i = new Intern("Darshana", "Intern", 60000);
		SeniorDeveloper sd = new SeniorDeveloper("Kratika", "Senior Developer", 70000);
		ManualTestEngineer m = new ManualTestEngineer("Yashoda", "Manual Tester", 40000);
		AutomationTestEngineer a = new AutomationTestEngineer("Sanjana", "Automation Tester", 50000);
		Hr h = new Hr("Ranjitha", "HR", 100000);
		e.get(i);
		System.out.println("____________");
		e.get(m);
		System.out.println("_____________");
		e.get(sd);
		System.out.println("_____________");
		e.get(a);
		System.out.println("_____________");
		e.get(h);
		System.out.println("______________");
		Employee ee = new Employee();

	}

}
