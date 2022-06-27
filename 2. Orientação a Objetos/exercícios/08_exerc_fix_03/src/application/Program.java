package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Enter with the name of the student: ");
		student.name = sc.nextLine();
		
		System.out.println("Enter with the grades of that student. Grade max 30, 35, 35.");
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		student.media();
		student.show();
	
		sc.close();
	}

}
