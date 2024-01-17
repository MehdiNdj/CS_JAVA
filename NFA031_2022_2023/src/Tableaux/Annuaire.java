package Tableaux;
import java.util.ArrayList;
import java.util.Scanner;

public class Annuaire {

	public static void main(String[] args) {
		ArrayList<String>profs = new ArrayList <String>();
		String nom, prenom, matricule, statut;
		
		char reponse = 'Y';
		while(reponse == 'Y') {
		
			Scanner clavier = new Scanner(System.in);
		
			System.out.println("Nom du prof :");
			nom = clavier.next();
			profs.add(nom);
		
			System.out.println("Prénom du prof :");
			prenom = clavier.next();
			profs.add(prenom);
		
			System.out.println("Matricule du prof :");
			matricule = clavier.next();
			profs.add(matricule);
		
			System.out.println("Statut du prof :");
			statut = clavier.next();
			profs.add(statut);
		
			System.out.println("Souhaitez-vous rajouter des profs ? Y ou N");
			String rep = clavier.next();
			reponse = rep.charAt(0);
			}
		System.out.println("Voici la liste des profs : " + profs);
		}

}
