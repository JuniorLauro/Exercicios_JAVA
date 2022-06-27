import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int x, i;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número maior que 1 e menor que 1000: ");
		x = sc.nextInt();
		
		for(i=1; i<=x; i++) {
			if(i % 2 != 0)
				System.out.printf("\n %d ",i);
		}
		
		sc.close();
	}

}
