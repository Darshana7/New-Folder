package encapsulatio_n;

public class Admin {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setempId(1);
		employee1.setName("A");
		employee1.setAge(20);
		employee1.setDesignation("Software Engineer");
		Employee employee2 = new Employee();
		employee2.setempId(2);
		employee2.setName("B");
		employee2.setAge(19);
		employee2.setDesignation("Tech lead");
		
		employee2.getEmpId();
		employee2.getName();
		employee2.getAge();
		employee2.getDesignation();
		employee1.getEmpId();
		employee1.getName();
		employee1.getAge();
		employee1.getDesignation();
		System.out.println("==========");
	}
}
