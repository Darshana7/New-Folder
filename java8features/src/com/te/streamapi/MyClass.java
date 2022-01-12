package com.te.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyClass {

	public static void main(String[] args) {
		
		List<Employee> list= Arrays.asList(new Employee(107, "Vivek", 30000, "Developer", 22),
				new Employee(111, "Manju", 25000, "HR", 25),
				new Employee(112, "Ranjitha", 35000, "Architect" , 17),
				new Employee(105, "Kratika", 40000, "Developer", 20),
				new Employee(115, "Yashoda", 80000, "MD", 50),
				new Employee(106, "Sandeep", 17000, "Tester", 35));
		Employee e=list.get(0);
		for(int i=1; i<list.size();i++) {
		if(e.getAge()>list.get(i).getAge()) {
		e=list.get(i);
		}
		System.out.println(e);
		System.out.println("===========");

		Stream<Employee> stream=list.stream();
		Optional<Employee> min = stream.min(Comparator.comparing(Employee::getSalary));
		System.out.println(min);

		System.out.println("========");

		list.stream().max(Comparator.comparing((Function<? super T, ? extends U>) Employee::getEmpId)).ifPresent(System.out::println);
		System.out.println("========");

		//sorting
		List<Employee> collect=list.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		System.out.println("========");

		Map<String, List<Employee>> collect2 = list.stream().collect(Collectors.groupingBy(Employee::getDesignation));
		
		collect2.forEach((department,emp) -> {
			System.out.println(department);
			emp.forEach(System.out::println);
		});
		
		System.out.println("========");
		List<Employee> collect3 = list.stream().filter(em->em.getAge()>20).collect(Collectors.toList());
		collect3.forEach(System.out::println);
		System.out.println("========");
		}
		}
}
