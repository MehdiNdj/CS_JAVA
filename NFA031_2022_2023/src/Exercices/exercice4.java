package Exercices;
import java.util.Scanner;

public class exercice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez choisir une devise de conversion de la somme en euros.");
		System.out.println("Saisissez 1 pour une conversion en dollars");
		System.out.println("Saisissez 2 pour une conversion en livres sterling");
		System.out.println("Saisissez 3 pour une conversion en franc CFA");
		
		double dollar = 1.02;
		double livre = 0.87;
		double CFA = 669.85;
		
		int choixDevise = sc.nextInt();

		while (choixDevise>3 || choixDevise<1) {
			System.out.println("Choix de devise invalide, veuillez le saisir à nouveau.");
			choixDevise = sc.nextInt();
		}
		
		System.out.println("Veuillez maintenant saisir votre somme en euros :");
		double sommeEur = sc.nextDouble();
		
		if (choixDevise == 1) {
			System.out.println(sommeEur+ "€ est égal à " +(sommeEur*dollar)+ "$.");
		}
		else if (choixDevise == 2) {
			System.out.println(sommeEur+ "€ est égal à " +(sommeEur*livre)+ "£.");
		}
		else if (choixDevise == 3) {
			System.out.println(sommeEur+ "€ est égal à " +(sommeEur*CFA)+ " francs CFA.");
		}
	}
}