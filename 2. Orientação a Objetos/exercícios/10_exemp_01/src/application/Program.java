package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Insira o tamanho do vetor: ");
		n = sc.nextInt();
		
		double[] vect = new double[n];
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.print("Digite a altura da pessoa "+ (i+1) + " :");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for(int i=0; i<3; i++) {
			sum += vect[i];
		}

		double avg = sum/n;
		
		System.out.println();
		System.out.printf("A média da altura das três pessoas é: " + "%.2f", avg);
		
		sc.close();
	}

}
