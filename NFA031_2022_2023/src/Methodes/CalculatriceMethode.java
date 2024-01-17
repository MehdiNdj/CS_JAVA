package Methodes;

import java.util.Scanner;

public class CalculatriceMethode {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Veuillez saisir le type d'opération :");
		System.out.println("+ pour une addition");
		System.out.println("- pour une soustraction");
		System.out.println("* pour une multiplication");
		System.out.println("/ pour une division");

		String saisie = clavier.next();
		char operation = saisie.charAt(0);
		System.out.println("Saisissez le premier nombre :");
		double nb1 = clavier.nextDouble();
		System.out.println("Saissisez le deuxième nombre");
		double nb2 = clavier.nextDouble();
		
		switch (operation) {
			case '+': {
				System.out.println("Le résultat est : " + ClassMethode.addition(nb1, nb2));
					break;
			}
			case '-': {
				System.out.println("Le résultat est : " + ClassMethode.soustraction(nb1, nb2));
					break;
			}
			case '*': {
				System.out.println("Le résultat est : " + ClassMethode.multiplication(nb1, nb2));
					break;
			}
			case '/': {
				System.out.println("Le résultat est : " + ClassMethode.division(nb1, nb2));
					break;
			}
			default:
				throw new IllegalArgumentException("Valeur incorrecte : " + operation);
		}
	}
}
