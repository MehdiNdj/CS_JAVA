package Structure_Conditionnelle;
import java.util.Scanner;

public class TP1_PrimeSalaire {

	public static void main(String[] args) {
		System.out.println("Veuillez saisir votre sexe (M/F), salaire et statut "
				+ "(C pour cadre sinon A) (Ex: F 2000 C)");
		
		Scanner sc = new Scanner(System.in);
		char sexe = sc.next().charAt(0);
		double salaire = sc.nextDouble();
		char statut = sc.next().charAt(0);
		
		sexe = Character.toUpperCase(sexe);
		statut = Character.toUpperCase(statut);
		
		if (sexe == 'F') {
			if (statut == 'C') {
				if (salaire < 2000) {
					System.out.println("Votre prime est donc de 1000€ soit un total de "+ 
							(salaire + 1000)+"€.");
				}
				else if (salaire >= 2000 && salaire <= 5000) {
					System.out.println("Votre prime est donc de 500€ soit un total de "+ 
							(salaire + 500)+"€.");
				}
				else {
					System.out.println("Votre salaire est trop élevé, vous n'aurez pas de "
							+ " prime cette année.");
				}
			}
			else if (statut == 'A') {
				System.out.println("Votre prime est de 3000€ soit un total de "+ 
						(salaire + 3000)+"€.");
			}
		}
		if (sexe == 'M') {
			if (statut == 'C') {
				if (salaire < 2000) {
					System.out.println("Votre prime est donc de 900€ soit un total de "+ 
							(salaire + 900)+"€.");
				}
				else if (salaire >= 2000 && salaire <= 5000) {
					System.out.println("Votre prime est donc de 400€ soit un total de "+ 
							(salaire + 400)+"€.");
				}
				else {
					System.out.println("Votre salaire est trop élevé, vous n'aurez pas de "
							+ " prime cette année.");
				}
			}
			else {
				System.out.println("Vous n'aurez aucune prime cette année.");
			}
		}
		else {
			System.out.println("Vous n'aurez aucune prime cette année.");
		}
	}
}