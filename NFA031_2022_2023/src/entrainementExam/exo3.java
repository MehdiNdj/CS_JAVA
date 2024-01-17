package entrainementExam;
import java.util.Scanner;

public class exo3 {
	
	public static void main(String [] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir heure début");
		int heureDebut = clavier.nextInt();		
		System.out.println("Saisir heure fin");
		int heureFin = clavier.nextInt();
		System.out.println("Abonné ? O/N");
		String statut = clavier.next();
		
		if (heureDebut < 0 || heureDebut > 24 || heureFin < 0 || heureFin > 24) {
			System.out.println("Heures doivent comprises entre 0 et 24");
		} else if (heureDebut == heureFin) {
			System.out.println("Location bien courte");
		} else if (heureFin < heureDebut) {
			System.out.println("L'heure de fin est avant l'heure de début");
		} else {
			int duree = heureFin - heureDebut;
			if (statut.equalsIgnoreCase("O")) {
				System.out.println("Prix = " + duree * 2 + "€");
			} else if (statut.equalsIgnoreCase("N")) {
				System.out.println("Prix = " + duree * 3 + "€");
			}
		}
	}
	
}
