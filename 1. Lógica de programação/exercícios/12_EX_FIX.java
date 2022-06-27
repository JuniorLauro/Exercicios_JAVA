import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int codigo, quantidade;
		double total = 0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do alimento que deseja comprar:"); 
		codigo=sc.nextInt();
		System.out.println("Digite a quantidade que deseja deste alimento:"); 
		quantidade=sc.nextInt();
		
		if(codigo == 1) 
			total = quantidade * 4.00;
		
		else if(codigo == 2) 
			total = quantidade * 4.50;
		
		else if(codigo == 3) 
			total = quantidade * 5.00;
		
		else if(codigo == 4) 
			total = quantidade * 2.00;
		
		else if(codigo == 5) 
			total = quantidade * 1.50;
		
		else {
			System.out.println("Código invalido");
			sc.close();
			return;
		}
		sc.close();
		
		System.out.printf("\n TOTAL A PAGAR: R$%.2f", total);
	}

}
