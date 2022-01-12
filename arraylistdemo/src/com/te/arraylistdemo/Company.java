package com.te.arraylistdemo;


public class Company {
	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList();
		Employee employee = new Employee(1, "Vivek", 1000000);
		// Employee employee = new Employee(1, "Vivek",1000000);
		// arrayList.add(employee);
		arrayList.add(new Employee(2, "Ranjitha", 2000000));
		arrayList.add(new Employee(3, "Sashi", 3000000));
		arrayList.add(new Employee(5, "Praveen", 122344555));
		arrayList.add(employee);
		// Employee employee = new Employee(1, "Vivek",1000000);
		// arrayList.add(employee);
		// System.out.println(arrayList.get(2));
		// arrayList.add(2,employee);
		// arrayList.set(2, new Employee(10, "Messi", 4000000));
		for (Employee e : arrayList) {
			System.out.println(e);
		}
		System.out.println("==============");

		// Collections.sort(arrayList);
		// for(Employee e:arrayList) {
		// System.out.println(e);
		// }
		Collections.sort(arrayList, new SortBySalary());
		for (Employee e : arrayList) {
			System.out.println(e);

		}
	}
}
