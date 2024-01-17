package Exercices;
import java.util.Scanner;

public class exercice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez choisir un type d'opération");
		System.out.println("Tapez 1 pour une addition");
		System.out.println("Tapez 2 pour une soustraction");
		System.out.println("Tapez 3 pour une division");
		System.out.println("Tapez 4 pour une multiplication");
		
		int choixOp = sc.nextInt();
		
		while (choixOp>4 || choixOp<1) {
			System.out.println("Choix de type d'opération invalide, veuillez le saisir à nouveau");
			choixOp = sc.nextInt();
		}
		
		System.out.println("Veuillez saisir le premier nombre");
		int nb1 = sc.nextInt();
		System.out.println("Veuillez saisir le deuxième nombre");
		int nb2 = sc.nextInt();
		
		if (choixOp==1) {
			System.out.println(nb1+ " + " + nb2 + " = " +(nb1 + nb2));
		}
		else if (choixOp==2) {
			System.out.println(nb1+ " - " + nb2 + " = " +(nb1 - nb2));
		}
		else if (choixOp==3) {
			System.out.println(nb1+ " / " + nb2 + " = " +(nb1 / nb2));
		}
		else if (choixOp==4) {
			System.out.println(nb1+ " * " + nb2 + " = " +(nb1 * nb2));
		}
	}
}
