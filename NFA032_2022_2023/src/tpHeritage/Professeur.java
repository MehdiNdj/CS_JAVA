package tpHeritage;

public class Professeur extends Personne {
	
	private String matiereEnseignee;
	private int numeroClasse;
	
	public Professeur(String nom, String prenom, int age, String matiereEnseignee, int numeroClasse) {
		super(nom, prenom, age);
		this.matiereEnseignee = matiereEnseignee;
		this.numeroClasse = numeroClasse;
	}

	public String getMatiereEnseignee() {
		return matiereEnseignee;
	}

	public void setMatiereEnseignee(String matiereEnseignee) {
		this.matiereEnseignee = matiereEnseignee;
	}

	public int getNumeroClasse() {
		return numeroClasse;
	}

	public void setNumeroClasse(int numeroClasse) {
		this.numeroClasse = numeroClasse;
	}

	/*@Override
	public String toString() {
		return "Professeur " + super.toString() + "[matiereEnseignee=" + matiereEnseignee + ", numeroClasse=" + numeroClasse + "]";
	}*/
	
}
