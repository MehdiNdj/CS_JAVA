package Exos;

public class testCompte {

	public static void main(String[] args) {
		/*Compte compteOuvrier = new Compte(2, 1000, 200);
		System.out.println(compteOuvrier.toString());
		compteOuvrier.crediter(150);
		System.out.println(compteOuvrier.toString());
		
		compteOuvrier.debiter(600);
		System.out.println(compteOuvrier.toString());
		
		compteOuvrier.debiter(500);
		System.out.println(compteOuvrier.toString());
		
		compteOuvrier.debiter(200);
		System.out.println(compteOuvrier.toString());
		
		compteOuvrier.debiter(70);
		System.out.println(compteOuvrier.toString()); */
		Compte compteouvrier1 = new Compte (1, 1000, 200);
		Compte cadre1 = new Compte (2, 10000, 2000);
		Compte cadre2 = new Compte (3, 100, 2000);
		
		boolean response = compteouvrier1.equals(cadre2);
		boolean response2 = cadre2.equals(cadre1);
		System.out.println(response);
		System.out.println(response2);
	}
}
