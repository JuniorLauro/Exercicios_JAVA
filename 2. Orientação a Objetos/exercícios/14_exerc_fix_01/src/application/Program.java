package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Definindo Formatação da DATA;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//Criando e implementando uma Lista do tipo Produto;
		List<Product> product = new ArrayList<>();
		
		System.out.print("How many products will be in the list? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Commom, Used or Imported (c/u/i)? ");
			char ans = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: $");
			Double price = sc.nextDouble();
			
			//Definindo o tipo do produto;
			if(ans == 'c') {
				product.add(new Product(name, price));
			}
			
			if(ans == 'i') {
				System.out.print("Customs fee: $");
				Double customsFee = sc.nextDouble();
				product.add(new ImportedProduct(name, price, customsFee));
			}
			
			if(ans == 'u') {
				System.out.print("Manufacture Date (dd/mm/yyyy): ");
				Date manufaturingDate = sdf.parse(sc.next());
				product.add(new UsedProduct(name, price, manufaturingDate));
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for(Product x : product) {
			System.out.println(x.priceTag());
		}
		
		sc.close();
	}

}
