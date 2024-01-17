package BanquePersonne;

public class Test {

	public static void main(String[] args) {
        Personne personne = new Personne("John Doe", "123 rue de la Paix", "01/01/1990");
        personne.ajouterCompteBancaire("123456789", 1000.0, "01/01/2021");

       // personne.afficherInformations();
        System.out.println(personne.toString());

        personne.getCompteBancaire().deposer(500.0);

        // Effectuer un retrait sur le compte bancaire
        personne.getCompteBancaire().retirer(2000.0);

        // Afficher les informations de la personne et du compte bancaire
        //personne.afficherInformations();
        System.out.println(personne.toString());


        CompteBancaire moncompte = new CompteBancaire("14444",5000,"14/01/2019");
        Personne moi = new Personne("John Doe", "123 rue de la Paix", "01/01/1990", moncompte);
	}
}
