import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int ID;
		double money, hora, salario;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de identificação do trabalhador: ");
		ID = sc.nextInt();
		
		System.out.println("Digite o total de horas trabalhadas: ");
		hora = sc.nextDouble();
		
		System.out.println("Digite a remuneração/hora do trabalhador: ");
		money = sc.nextDouble();
		
		sc.close();
		
		salario = money * hora;
		System.out.println("ID: " + ID + "\nSalario: U$" + salario);
	}

}
