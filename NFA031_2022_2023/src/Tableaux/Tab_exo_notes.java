package Tableaux;

import java.util.Scanner;

public class Tab_exo_notes {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int [][] tableau;
		int i, j;
		int nbEtu, notes;
		
		System.out.println("Veuillez saisir le nombre d'étudiants");
		nbEtu = clavier.nextInt();
		
		System.out.println("Veuillez saisir le nombre de notes de chaque étudiant");
		notes = clavier.nextInt();
		tableau = new int [nbEtu] [notes];
		
		for (i = 0; i < tableau.length; i++) {
			System.out.println("Saisissez la ou les notes du " + (i+1) + "e étudiant");
			for (j = 0; j < tableau[i].length; j++) {
				System.out.println("Veuillez saisir la " + (j+1) + "e note ");
				tableau[i][j] = clavier.nextInt();
			}
		}
		for (i = 0; i < tableau.length; i++) {
			System.out.println("Les notes du " + (i+1) + "e étudiant sont :");
			for (j = 0; j < tableau[i].length; j++) {
				System.out.println(tableau[i][j]);
			}
		}
	}

}
