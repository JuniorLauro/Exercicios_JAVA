package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> emp = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Employee #"+ i +" data: ");
			System.out.print("Outsourced? <y/n>: ");
			char check = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hourWork = sc.nextInt();
			System.out.print("Value Per Hour: ");
			Double valuePerHour = sc.nextDouble();
			
			if(check == 'y') {
				System.out.print("Additional Charge: ");
				Double additionalCharge = sc.nextDouble();
				emp.add(new OutsourcedEmployee(name, hourWork, valuePerHour, additionalCharge));
			}
			else 
				emp.add(new Employee(name, hourWork, valuePerHour));
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee x: emp) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
