package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Enter with the name, Gross Salary and the Tax of the employeer: ");
		System.out.printf("Name:"); emp.name = sc.nextLine();
		System.out.printf("Gross Salary: "); emp.GrossSalary = sc.nextDouble();
		System.out.printf("Tax: "); emp.Tax = sc.nextDouble();
		
		System.out.printf("\nEmployee: %s, Salary: $ %.2f\n", emp.name, emp.netSalary());
		
		System.out.printf("Which percentage to increase te salary? "); 
		double percentage = sc.nextDouble();
		emp.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.printf("Updated Data: " + emp);
		
		
		sc.close();
	}

}
