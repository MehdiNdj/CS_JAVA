package conditionTernaire;

import java.util.Scanner;

public class TestConditionTernaire {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int prix = 5000;
		int prixUtilisateur = 0;
		
		while (prixUtilisateur != prix) {
			System.out.println("Quel est votre prix ?");
			prixUtilisateur = clavier.nextInt();
			String reponse = (prixUtilisateur == prix) ? "C'est gagné" :
				(prixUtilisateur < prix) ? "C'est plus" :
					(prixUtilisateur > prix) ? "C'est moins" : "Saisie incorrecte";
			System.out.println(reponse);
		}
	}
}