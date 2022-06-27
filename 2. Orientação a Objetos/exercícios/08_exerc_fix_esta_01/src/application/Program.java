package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double cot = sc.nextDouble();

		System.out.print("How many dollars will be bought? ");
		double quant = sc.nextDouble();

		double total = CurrencyConverter.Conversion(quant, cot);

		System.out.printf("\nAmount to be paid in reais: R$ %.2f", total);

		sc.close();
	}

}
