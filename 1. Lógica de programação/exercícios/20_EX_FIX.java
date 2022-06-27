import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n, i, x = 0, entrada = 0, saida = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor inteiro: ");
		n = sc.nextInt();
		
		for(i=0; i<n; i++) {
			x = sc.nextInt();
			if(x >= 10 && x <= 20)
				entrada = entrada + 1;
			else
				saida = saida + 1;
		}
		
		System.out.println("Valores dentro do intervalo [10;20]: "+ entrada);
		System.out.println("Valores fora do intervalo [10;20]: "+ saida);
		
		sc.close();
	}

}