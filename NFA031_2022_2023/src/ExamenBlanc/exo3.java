package ExamenBlanc;
import java.util.Scanner;

public class exo3 {

	public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        System.out.println("Veuillez entrer l'heure de début de location :");
        int heureDebut = clavier.nextInt();
        System.out.println("Veuillez entrer l'heure de fin de location :");
        int heureFin = clavier.nextInt();
        System.out.println("Veuillez entrer votre statut ('abonné' ou 'non') :");
        String statut = clavier.next();

        if (heureDebut < 0 || heureDebut > 24 || heureFin < 0 || heureFin > 24) {
            System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        } else if (heureDebut == heureFin) {
            System.out.println("Bizarre, vous n’avez pas loué votre vélo bien longtemps !");
        } else if (heureDebut > heureFin) {
            System.out.println("Bizarre, le début de la location est après la fin ...");
        } else {
            int heures = heureFin - heureDebut;
            int prix;
            
            if (statut.equalsIgnoreCase("abonné") || statut.equalsIgnoreCase("abonne") || statut.equalsIgnoreCase("abonner")) {
                prix = 2 * heures;
            } else {
                prix = 3 * heures;
            }
            System.out.println("Le coût de la location est de " + prix + " euros.");
        }
    }
}