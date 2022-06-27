import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int x = 0, alc = 0, gas = 0, dis = 0;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
				
		while(x != 4) {
			
			if(x == 1)
				alc += 1;
			else if( x == 2)
				gas += 1;
			else if(x == 3)
				dis += 1;
			else
				System.out.println("Opção invalida");
			x = sc.nextInt();
		}
		sc.close();
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: "+ alc);
		System.out.println("Gasolina: "+ gas);
		System.out.println("Diesel: "+ dis);
	}

}