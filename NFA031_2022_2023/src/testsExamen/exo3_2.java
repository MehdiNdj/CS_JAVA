package testsExamen;

import java.util.Scanner;

public class exo3_2 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisissez le nombre de la table de multiplication");
		int nb = clavier.nextInt();
		
		if (nb >= 1 && nb <=9) {
			for (int i = 1; i < nb; i++) {
				System.out.println(i + " x " + nb + " = " + (i*nb));
			}	
		}
	}
}