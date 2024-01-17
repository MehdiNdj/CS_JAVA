package tpHeritage;

public class Etudiant extends Personne{
	
	private String niveau;
	private double moyenne;
	
	public Etudiant(String nom, String prenom, int age, String niveau, double moyenne) {
		super(nom, prenom, age);
		this.niveau = niveau;
		this.moyenne = moyenne;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}

	@Override
	public String toString() {
		return "Etudiant [niveau=" + super.toString() + niveau + ", moyenne=" + moyenne + "]";
	}

}
