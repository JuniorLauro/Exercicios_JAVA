import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int x, y;
		int SOMA;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros:");
		x = sc.nextInt(); y =sc.nextInt();
		
		SOMA = x + y;
		sc.close();
		
		System.out.println("Soma: "+ SOMA);
	}

}
