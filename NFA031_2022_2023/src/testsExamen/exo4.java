package testsExamen;

import java.util.Scanner;

public class exo4 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Veuillez renseigner votre poids en kg");
		double poids = clavier.nextDouble();
		System.out.println("Veuillez renseigner votre taille en mètres");
		double taille = clavier.nextDouble();
		double IMC = (poids/(taille*taille));
		
		System.out.println("Votre IMC est : " + IMC);
		System.out.println("Votre catégorie ci-dessous");
		if (IMC < 16) {
			System.out.println("Dénutrition");
		} else if (IMC > 16 && IMC < 18.5){
			System.out.println("Maigreur");
		}
	}
}
