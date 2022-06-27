package model.entitites;

import model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.balance = balance;
		this.holder = holder;
		this.number = number;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) throws DomainException {
		if(amount > getBalance()) {
			throw new DomainException("Not enough money in account.");
		}
		if(amount > getWithdrawLimit()) {
			throw new DomainException("The value exceeds withdraw value.");
		}
		else {
			balance -= amount;
		}
	}
	
	@Override
	public String toString() {
		return "New balance: $" + String.format("%.2f", getBalance());
	}
}
