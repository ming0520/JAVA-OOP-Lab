package Q1;

public class Employee {
	private int age;
	private int yearOfService;
	private int salary;
	
	public void set(int age, int yos, int salary) {
		this.age = age;
		this.yearOfService = yos;
		this.salary = salary;
	}
	
	public float getSalary() {
		return this.salary;
	}
	
	public void get() {
		System.out.println("Age              : " + this.age);
		System.out.println("Year of services : " + this.yearOfService);
		System.out.println("Salart           : RM" + Math.ceil(this.salary/1000)*1000);
	}

}
