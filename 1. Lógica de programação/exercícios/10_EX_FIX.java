import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A, B;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		A = sc.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		B = sc.nextInt();
		
		if(A <= B) {
			if((B % A) == 0)
				System.out.println("São multiplos");
			else
				System.out.println("Não são multiplos");
		}
		else {
			if(A % B == 0)
				System.out.println("São multiplos");
			else
				System.out.println("Não são multiplos");
		}
			
		sc.close();
	}
}