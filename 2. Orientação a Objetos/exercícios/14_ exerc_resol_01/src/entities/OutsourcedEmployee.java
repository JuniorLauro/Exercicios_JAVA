package entities;

public final class OutsourcedEmployee extends Employee {

	private Double additionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hourWork, Double valuePerHour, Double additionalCharge) {
		super(name, hourWork, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public final Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
