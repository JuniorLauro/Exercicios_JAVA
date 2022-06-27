package entities;

public class Employee {

	public String name;
	public double GrossSalary;
	public double Tax;
	
	public double netSalary() {
		return GrossSalary - Tax;
	}
	
	public void IncreaseSalary(double percentage) {
		this.GrossSalary += (this.GrossSalary * (percentage/100));
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f", netSalary());
	}
}
