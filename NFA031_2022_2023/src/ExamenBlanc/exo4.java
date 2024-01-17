package ExamenBlanc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class exo4 {
	  public static void main(String[] args) {
		    Scanner clavier = new Scanner(System.in);
		    ArrayList<String> laFerme = new ArrayList<String>();

		    System.out.println("Combien d'animaux avez-vous dans votre ferme ?");
		    int nb = clavier.nextInt();

		    System.out.println("Veuillez saisir le nom de chaque animal :");
		    for (int i = 0; i < nb; i++) {
		      laFerme.add(clavier.next());
		    }

		    System.out.println("Liste des animaux de votre ferme : " + laFerme);

		    // 1)	Supprimer le deuxième élément de la liste
		    laFerme.remove(1);
		    System.out.println("Liste des animaux après suppression du deuxième élément : " + laFerme);

		    // 2)	Trier par ordre alphabétique les éléments contenus dans laFerme
		    Collections.sort(laFerme);
		    System.out.println("Liste des animaux triée par ordre alphabétique : " + laFerme);

		    // 3)	Récupérer et afficher seulement le troisième élément de laFerme
		    if (laFerme.size() > 2) {
		    	System.out.println("Troisième élément de la liste : " + laFerme.get(2));
		    } else {
		    	System.out.println("Il n'y a pas de troisième élément dans la liste.");
		    }

		    // 4)	Inverser les éléments de la liste avant de la réafficher de nouveau
		    Collections.reverse(laFerme);
		    System.out.println("Liste des animaux après inversion : " + laFerme);

		    // 5)	Créer une autre liste appelée laFerme2
		    ArrayList<String> laFerme2 = new ArrayList<String>();

		    // 6)	Copiez les éléments contenus dans la liste laFerme dans laFerme2 en la clonant
		    laFerme2 = (ArrayList<String>) laFerme.clone();
		    
		    // 7)	Afficher la liste laFerme2
		    System.out.println("Liste laFerme2 après copie des éléments de laFerme : " + laFerme2);

		    // 8)	Mélanger les éléments de la liste laFerme2, puis afficher à nouveau les éléments après mélange 
		    Collections.shuffle(laFerme2);
		    System.out.println("Liste laFerme2 après mélange : " + laFerme2);
		  }
		}