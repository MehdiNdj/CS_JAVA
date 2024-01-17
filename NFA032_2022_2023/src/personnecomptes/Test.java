package personnecomptes;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Personne personne = new Personne("Jean");
        Compte compte1 = new Compte("Compte courant", 1000);
        Compte compte2 = new Compte("Compte épargne", 5000);
        personne.ajouterCompte(compte1);
        personne.ajouterCompte(compte2);

        System.out.println("Nom de la personne : " + personne.getNom());

        ArrayList<Compte> comptes = personne.getComptes();
        for (Compte compte : comptes) {
            System.out.println("Nom du compte : " + compte.getNom());
            System.out.println("Solde du compte : " + compte.getSolde());
        }
        System.out.println(comptes);
    }
}