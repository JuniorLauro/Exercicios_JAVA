import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A, B;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		A = sc.nextInt();
		
		System.out.println("Digite outro n�mero inteiro: ");
		B = sc.nextInt();
		
		if(A <= B) {
			if((B % A) == 0)
				System.out.println("S�o multiplos");
			else
				System.out.println("N�o s�o multiplos");
		}
		else {
			if(A % B == 0)
				System.out.println("S�o multiplos");
			else
				System.out.println("N�o s�o multiplos");
		}
			
		sc.close();
	}
}