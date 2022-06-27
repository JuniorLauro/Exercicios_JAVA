import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double A, B, C, TRI, CIR, TRA, QUA, RET;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Digite três valores maiores que zero: ");
			A = sc.nextDouble();
			B = sc.nextDouble();
			C = sc.nextDouble();
		} while (A < 0 || B < 0 || C < 0);

		TRI = (C * A) / 2;
		CIR = Math.PI * Math.pow(C, 2);
		TRA = ((A + B) * C) / 2;
		QUA = Math.pow(B, 2);
		RET = A * B;

		sc.close();

		System.out.println("Área do Triângulo Retangulo: " + TRI);
		System.out.println("Área do Circulo: " + CIR);
		System.out.println("Área do Trapézio: " + TRA);
		System.out.println("Área do Quadrado: " + QUA);
		System.out.println("Área do Retangulo: " + RET);
	}

}
