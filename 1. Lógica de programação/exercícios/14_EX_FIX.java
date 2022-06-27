import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double A, B;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as coordenadas X e Y: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		if(A > 0 && B > 0)
			System.out.println("Q1");
		else if (A < 0 && B > 0)
			System.out.println("Q2");
		else if (A < 0 && B < 0)
			System.out.println("Q3");
		else if (A > 0 && B < 0)
			System.out.println("Q4");
		else
			System.out.println("Origem");
		
		sc.close();

	}

}
