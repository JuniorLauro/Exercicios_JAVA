package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		
		Account x = new Account(1001, "Alex", 1000.0);
		Account y = new BusinessAccount(1002, "Maria", 1000.0, 500.0);
		Account z = new SavingAccount(1003, "Mario", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		z.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		System.out.println(z.getBalance());
	}
}
