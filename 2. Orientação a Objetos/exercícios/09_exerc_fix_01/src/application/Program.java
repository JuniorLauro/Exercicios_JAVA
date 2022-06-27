package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Account account;
		
		System.out.print("Enter the account number: ");
		int number = sc.nextInt();
		System.out.print("Enter the account name: ");
		sc.nextLine(); // Consuming ghost line;
		String name = sc.nextLine();
		Double amount;
		
		System.out.print("Is there a initial deposit? (Y/N): ");
		char letter = sc.next().charAt(0);
		if (letter == 'y') {
			System.out.print("How many? ");
			amount = sc.nextDouble();
			account = new Account(name,number, amount);
		}
		else {
			account = new Account(name,number);
		}
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a new deposit value: ");
		amount = sc.nextDouble();
		account.deposit(amount);
		
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		if (amount != 0)
			account.withdraw(amount);
		
		System.out.println(account);
		

		sc.close();
	}

}
