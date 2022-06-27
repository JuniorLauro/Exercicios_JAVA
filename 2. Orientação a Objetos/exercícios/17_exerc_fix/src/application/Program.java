package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Product> list = new ArrayList<>();
		
		System.out.print("Path of the file: "); // C:\ws-eclipse\Product.csv
		String path = sc.nextLine();
		
		boolean sucess = new File("C:\\ws-eclipse\\out").mkdir();
		System.out.println(sucess);
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String word[] = line.split(",");
				String name = word[0];
				Double price = Double.parseDouble(word[1]);
				Integer quantity = Integer.parseInt(word[2]);
				
				list.add(new Product(name, price, quantity));
				
				line = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\ws-eclipse\\out\\summary.csv"))){
				for(Product x : list) {
					bw.write(x.getName() + "," + String.format("%.2f", x.totalPrice()));
					bw.newLine();
				}
			}
			catch(IOException e) {
				System.out.println(e.getLocalizedMessage());
			}
			
		}
		catch(IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		sc.close();

	}

}
