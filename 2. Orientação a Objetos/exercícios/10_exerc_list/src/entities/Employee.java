package entities;

public class Employee {

	private Integer id;
	private String name;
	private Double salary = 0.0;
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void plusSalary(Double percent) {
		salary += salary * percent / 100;
	}
	
	public String toString() {
		return "Id: " + id + ", Name: " + name + ", Salary: R$" + salary;
	}
}
