import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int ID1, ID2, QT1, QT2;
		double PRECO1, PRECO2, TOTAL;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o codigo de identifica��o da Pe�a 01: ");
		ID1 = sc.nextInt();
		
		System.out.println("Digite a quantidade desta pe�as no estoque: ");
		QT1 = sc.nextInt();
		
		System.out.println("Digite o pre�o unitario desta pe�a: ");
		PRECO1 = sc.nextDouble();
		
		System.out.println("Digite o codigo de identifica��o da Pe�a 02: ");
		ID2 = sc.nextInt();
		
		System.out.println("Digite a quantidade desta pe�as no estoque: ");
		QT2 = sc.nextInt();
		
		System.out.println("Digite o pre�o unitario desta pe�a: ");
		PRECO2 = sc.nextDouble();
		
		TOTAL = (double)QT1 * PRECO1 + (double)QT2 * PRECO2;
		sc.close();
		
		System.out.printf("Total a pagar: R$%.2f", TOTAL);
	}

}
