import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	double salario, imposto;
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o seu salário: ");
	salario = sc.nextDouble();
	
	if(salario <= 2000.00)
		imposto = 0.0;
	
	else if(salario <= 3000.0)
		imposto = (salario - 2000.0) * 0.08;
	
	else if(salario <= 4500.0)
		imposto = (salario - 3000.0 ) * 0.18 + 1000.0 * 0.08;
	
	else
		imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
	
	if(imposto == 0.0)
		System.out.println("Insento");
	else
		System.out.printf("\nImposto: %.2f",imposto);
		
	sc.close();

	}

}
