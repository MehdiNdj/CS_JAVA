package Exercices;
import java.util.Scanner;

public class exercice_prenom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est votre prénom ?");
		String prenom = sc.nextLine();
		
		System.out.println("Bonjour " +prenom);
	}

}