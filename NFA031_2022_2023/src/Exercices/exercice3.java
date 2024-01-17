package Exercices;
import java.util.Scanner;

public class exercice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le premier nombre à additionner");
		int nb1 = sc.nextInt();
		System.out.println("Veuillez saisir le deuxième nombre à additionner");
		int nb2 = sc.nextInt();
		System.out.println("Le résultat est : " +(nb1 + nb2));
	}
}