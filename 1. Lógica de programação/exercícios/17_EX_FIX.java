import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int x, y;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
				
		while(x != 0 || y != 0) {
			if(x > 0 && y > 0)
				System.out.println("1 Quadrante");
			else if(x < 0 && y > 0)
				System.out.println("2 Quadrante");
			else if(x < 0 && y < 0)
				System.out.println("3 Quadrante");
			else if(x > 0 && y < 0)
				System.out.println("4 Quadrante");

			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}