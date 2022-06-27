package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product x = new Product();
		
		System.out.println("Insert Product Data ");
		System.out.print("Name: "); x.name = sc.next();
		System.out.print("Price: "); x.price = sc.nextDouble();
		System.out.print("Quantity in stock: "); x.quantity = sc.nextInt();
		
		System.out.println("Product data: " + x);
		System.out.println();
		
		System.out.println("Enter the number of products to be add in stock: ");
		int quantity = sc.nextInt();
		x.addProducts(quantity);
		
		System.out.println("Product data updated: " + x);
		System.out.println();
		
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		x.removeProducts(quantity);

		System.out.println("Product data updated: " + x);
		sc.close();
	}

}
