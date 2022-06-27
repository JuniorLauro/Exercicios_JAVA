package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char wd = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			if(wd == 'i') {
				System.out.print("Health expenditures: ");
				Double healthTax = sc.nextDouble();
				list.add(new PessoaFisica(name, anualIncome, healthTax));
			}
			if(wd == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmp = sc.nextInt();
				list.add(new PessoaJuridica(name, anualIncome, numberOfEmp));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(Pessoa x : list) {
			System.out.println(String.format("%s: $%.2f",x.getName(), x.tax()));
		}
		
		Double sum = 0.0;
		for(Pessoa x : list) {
			sum += x.tax();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: %.2f", sum);
		
		sc.close();
	}

}
