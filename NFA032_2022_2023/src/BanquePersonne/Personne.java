package BanquePersonne;

public class Personne {
	private String nom;
	private String adresse;
	private String dateNaissance;
	private CompteBancaire compteBancaire;

	public Personne(String nom, String adresse, String dateNaissance) {
		this.nom = nom;
		this.adresse = adresse;
		this.dateNaissance = dateNaissance;
	}
	public Personne(String nom, String adresse, String dateNaissance, CompteBancaire compteBancaire) {
		this.nom = nom;
		this.adresse = adresse;
		this.dateNaissance = dateNaissance;
		this.compteBancaire = compteBancaire;
	}
	
	public void ajouterCompteBancaire(String numero, double solde, String dateOuverture) {
		this.compteBancaire = new CompteBancaire(numero, solde, dateOuverture);
	}
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", adresse=" + adresse + ", dateNaissance=" + dateNaissance
				+ ", compteBancaire=" + compteBancaire + "]";
	}
	
	public void afficherInformations() {
		System.out.println("Nom : " + nom);
		System.out.println("Adresse : " + adresse);
		System.out.println("Date de naissance : " + dateNaissance);
		System.out.println("Numéro de compte : " + compteBancaire.getNumero());
		System.out.println("Solde : : " + compteBancaire.getSolde());
		System.out.println("Date d'ouverture : " + compteBancaire.getDateOuverture());
	}
	
	public CompteBancaire getCompteBancaire() {
		return compteBancaire;
	}
}
