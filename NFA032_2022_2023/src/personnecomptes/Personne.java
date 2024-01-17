package personnecomptes;

import java.util.ArrayList;

class Personne {
    private String nom;
    private ArrayList<Compte> comptes;

    public Personne(String nom) {
        this.nom = nom;
        this.comptes = new ArrayList<Compte>();
    }

    public String getNom() {
        return this.nom;
    }

    public void ajouterCompte(Compte compte) {
        this.comptes.add(compte);
    }

    public ArrayList<Compte> getComptes() {
        return this.comptes;
    }
}

