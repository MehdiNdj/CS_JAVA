package Methodes;

public class premiereMethode {

	public static void main(String[] args) {
		System.out.println("Résultat = " + addition(10, 5));
		System.out.println("Résultat = " + division(10, 5));
		direBonjour("Marc");
		direBonjour("Marco");
	}
	
	public static void direBonjour() {
		System.out.println("Bonjour les amis");
	}
	
	public static void direBonjour(String nom) {
		System.out.println("Bonjour " + nom);
	}
	
	public static double addition(double val1, double val2) {
		double resultat = val1 + val2;
		return resultat;
	}
	
	public static double division(double val1, double val2) {
		double resultat = val1 / val2;
		return resultat;
	}
}