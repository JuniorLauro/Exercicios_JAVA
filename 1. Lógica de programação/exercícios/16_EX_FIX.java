import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
				
		while(x != 2002) {
			System.out.println("Senha invalida");
			x = sc.nextInt();
		}
		
		sc.close();
		System.out.println("Senha correta");
	}

}
