package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char wd = 'y';
		
		while(wd == 'y') {
			clearScreen();
			System.out.print("Write 2 numbers to sum: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println();
			System.out.print("The sum a + b is: " + (a+b));
			System.out.println();
			
			
			System.out.print("Do you want to do another sum? (y/n) ");
			wd = sc.next().charAt(0);
		}
		
		sc.close();
	}

	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  
}
