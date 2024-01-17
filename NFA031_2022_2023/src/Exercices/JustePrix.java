package Exercices;
import java.util.Scanner;

public class JustePrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int justePrix = (int)(Math.random()*2001); //* génère un nombre aléatoire entre 0 et 2001
		System.out.println(justePrix);
		System.out.println("Saisissez votre prix");
		int saisie = sc.nextInt();
		
		if (saisie == justePrix) {
			System.out.println("Le prix est juste");
	}
		else if (saisie < justePrix) {
			System.out.println("C'est plus");
		}
		else if (saisie > justePrix) {
			System.out.println("C'est moins");
		}
	}
}	