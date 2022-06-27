package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Register;

public class Program {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 int n = 0;
		 
		 do
		 {
			 System.out.print("Quantos estudantes irão alugar os quartos? (1 a 10): ");
			 n = sc.nextInt();
		 }while(n < 1 || n > 10);
		 
		 Register[] vect = new Register[10];
		 
		 for(int i=0; i<n; i++) {
			 System.out.println("Rent " + (i+1) + "#: ");
			 sc.nextLine();
			 System.out.print("Name: ");
			 String name = sc.nextLine();
			 System.out.print("Email: ");
			 String email = sc.nextLine();
			 System.out.print("Room: ");
			 int room = sc.nextInt();
			 vect[room] = new Register(name, email, room);
			 
			 System.out.println();
		 }
		 
		 System.out.println("Busy Rooms: ");
		 for(int i=0; i<vect.length; i++) {
			 if(vect[i] != null)
				 System.out.println(vect[i]);
		 }
		 
		 
		 sc.close();
	}

}
