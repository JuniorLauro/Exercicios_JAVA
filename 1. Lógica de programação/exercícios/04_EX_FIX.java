import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double A, B, C, D, DIF;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 4 n�meros: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		D = sc.nextDouble();

		DIF = (A * B - C * D);

		sc.close();

		System.out.println("A diferen�a entre os produtos s�o: " + DIF);
	}

}
