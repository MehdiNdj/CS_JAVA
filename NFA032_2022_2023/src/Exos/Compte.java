package Exos;

import java.util.Objects;

public class Compte {
	private int numero;
	private double solde;
	private double decouvert;
	
	public Compte(int numero, double solde, double decouvert) {
		this.numero = numero;
		this.solde = solde;
		this.decouvert = decouvert;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public double getDecouvertAutorise() {
		return decouvert;
	}
	public void setDecouvertAutorise(double decouvert) {
		this.decouvert = decouvert;
	}
	
	@Override
	public String toString() {
		return "Compte numéro : " + numero + ", solde = " + solde + ".";
	}
	
	public void crediter (double montant) {
		this.solde = this.solde + montant;
	}
	
	public void debiter (double montant) {
		if (montant <= this.solde + this.decouvert) {
			this.solde = this.solde - montant;
		}
		else {
			System.out.println("Solde insuffisant");
		}
	}
	public boolean equals(Compte p2) {
		if (this.solde < p2.solde)
			return false;
		else
			return true;
	}
}
