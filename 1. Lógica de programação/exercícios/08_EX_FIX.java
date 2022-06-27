import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int valor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		valor = sc.nextInt();
		
		if(valor >=0)
			System.out.println("O número é positivo");
		else
			System.out.println("O número é negativo");
		
		sc.close();
	}

}
