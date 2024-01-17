package BanquePersonne;

public class CompteBancaire {
	private String numero;
	private double solde;
	private String dateOuverture;
	
	public CompteBancaire(String numero, double solde, String dateOuverture) {
		this.numero = numero;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	
	public void deposer(double montant) {
		solde += montant; //solde = solde + montant;
	}
	
	public void retirer(double montant) {
		if (montant <= solde) {
			solde -= montant; //solde = solde - montant;
		} else {
			System.out.println("Solde insuffisant");
		}
	}

	@Override
	public String toString() {
		return "CompteBancaire [numero=" + numero + ", solde=" + solde + ", dateOuverture=" + dateOuverture + "]";
	}
}
