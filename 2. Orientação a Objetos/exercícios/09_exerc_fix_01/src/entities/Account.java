package entities;

public class Account {

	private String name;
	private int number;
	private double amount;
	
	public Account(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public Account(String name, int number, double initialDeposit) {
		this.name = name;
		this.number = number;
		deposit(initialDeposit);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void deposit(double amount) {
		this.amount += amount;
	}
	
	public void withdraw(double amount) {
		this.amount -= (amount + 5.00);
	}
	
	public String toString() {
		return   "Account Name: "
				+ name
				+ ", Number: "
				+ number
				+ ", Amount: $ "
				+ String.format("%.2f", amount);
	}
}
