package entities;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	public double media;
	
	public void media() {
		media = grade1 + grade2 + grade3;
	}
	
	public void show() {
		if(media >= 60.0) {
			System.out.printf("\nFinal Grade: %.2f", media);
			System.out.println("\nPass");
		}
		else {
			System.out.printf("\nFinal Grade: %.2f", media);
			System.out.printf("\nFailed");
			System.out.printf("\nMissing: %.2f", 60.0 - media);
		}
		
	}
	
	
}
