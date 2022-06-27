import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int inicio, fim, hora;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o horário que o jogo iniciou:");
		inicio = sc.nextInt();
		System.out.println("E o horário que o jogo terminou: ");
		fim = sc.nextInt();
		
		if(inicio >= fim) {
			hora = 24 - inicio + fim;
		}
		else {
			hora = fim - inicio;
		}
		sc.close();
		
		System.out.printf("\nO jogo durou %d horas", hora);
		
	}

}
