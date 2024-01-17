package Exercices;
import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir votre moyenne au bac");
		int moyenne = sc.nextInt();
		
		if (moyenne < 8) {
			System.out.println("Ajourné");
		}
		else if (moyenne > 15) {
			System.out.println("Mention Très Bien");
		}
		else {
			switch (moyenne) {
			case 8, 9 -> System.out.println("Rattrapage");
			case 10, 11 -> System.out.println("Admis");
			case 12, 13 -> System.out.println("Mention Assez Bien");
			case 14, 15 -> System.out.println("Mention Bien");
			default -> System.out.println("Saisie incorrecte");
			}
		}
	}
}