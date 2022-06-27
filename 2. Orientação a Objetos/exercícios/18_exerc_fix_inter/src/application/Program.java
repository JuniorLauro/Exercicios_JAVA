package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int conNumber = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date conDate = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		Double totalPrice = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		int months = sc.nextInt();
		
		Contract contract = new Contract(conNumber, conDate, totalPrice);
		ContractService contractService = new ContractService(new PaypalService());
		
		System.out.println("Installments:");
		for (Installment x : contract.getTotalContr()) {
			System.out.println(x);
		}

		sc.close();
	}

}
