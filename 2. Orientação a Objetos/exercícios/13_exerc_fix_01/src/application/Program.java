package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("~ Client Data ~");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("e-mail: ");
		String email = sc.nextLine();
		System.out.print("Birth Date (dd/mm/yyyy): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println();
		
		System.out.println("~ Order Data ~");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		System.out.print("How many items for this order? ");
		Integer n = sc.nextInt();
		
		Order order = new Order(new Date(), status, client);
		
		for(int i=1; i<=n; i++) {
			System.out.printf("Enter #%d data: \n", i);
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			OrderItem items = new OrderItem(quantity, productPrice, product);
			
			order.addItem(items);
		}
		System.out.println();
		System.out.println("~ Order Sumary ~");
		System.out.println(order);
		
		sc.close();
	}

}
