package entities;

public class Employee {

	private String name;
	protected Integer hourWork;
	protected Double valuePerHour;
	
	public Employee() {
	}
	
	public Employee(String name, Integer hourWork, Double valuePerHour) {
		this.name = name;
		this.hourWork = hourWork;
		this.valuePerHour = valuePerHour;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHourWork(Integer hourWork) {
		this.hourWork = hourWork;
	}
	
	public Integer getHourWork() {
		return hourWork;
	}
	
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public Double getValuePerHour() {
		return valuePerHour;
	}
	
	public Double payment() {
		return valuePerHour * hourWork;
	}
	
	public String toString() {
		return getName() + String.format(" - $%.2f", payment());
	}
	
	
}
