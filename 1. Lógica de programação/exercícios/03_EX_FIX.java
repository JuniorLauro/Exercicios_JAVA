import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double raio, area;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		do 
		{
			System.out.println("Digite um n�mero maior que zero: ");
			raio = sc.nextDouble();
		}
		while(raio < 0);
		
		area = Math.PI * Math.pow(raio, 2);
		
		sc.close();
		System.out.printf("A �rea do circulo de raio %.4f � de %.4f", raio, area);
	}

}
