package ExoIntro;

public class Livre {

	private int id;
	private String titre;
	private String auteur;
	private int prix;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}

	public static int count = 0;
	public Livre(String titre, String auteur, int prix) {
		this.id = ++count;
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Le prix du livre " + titre + " de l'auteur " + auteur + " est de " + prix + " euros.";
	}	
}
