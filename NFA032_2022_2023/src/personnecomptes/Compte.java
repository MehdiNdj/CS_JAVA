package personnecomptes;

class Compte {
    private String nom;
    private double solde;

    public Compte(String nom, double solde) {
        this.nom = nom;
        this.solde = solde;
    }

    public String getNom() {
        return this.nom;
    }

    public double getSolde() {
        return this.solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "nom='" + nom + '\'' +
                ", solde=" + solde +
                '}';
    }
}