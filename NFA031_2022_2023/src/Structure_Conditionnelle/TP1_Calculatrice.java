package Structure_Conditionnelle;
import java.util.Scanner;

public class TP1_Calculatrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Veuillez saisir votre premier nombre, l'opération, puis le deuxième nombre.");
	
		double nb1 = sc.nextDouble();
		char signe = sc.next().charAt(0);
		double nb2 = sc.nextDouble();
	
		if (signe == '+') {
			System.out.println("Le résultat est "+ (nb1 + nb2)); 
		}
		else if (signe == '-') {
			System.out.println("Le résultat est "+ (nb1 - nb2)); 
		}
		else if (signe == '*') {
			System.out.println("Le résultat est "+ (nb1 * nb2)); 
		}
		else if (signe == '/') {
			System.out.println("Le résultat est "+ (nb1 / nb2)); 
		}
		else {
			System.out.println("Saisie incorrecte, veuillez saisir votre opération sous forme nb1 + nb2.");
		}
	}
}