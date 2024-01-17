package ExamenBlanc;

public class exo2 {

/*	public static void main(String[] args) {
		addition(-5,-4);
	} */
	
	public static void addition(int val1, int val2) {
		if (val1 < 0 || val2 < 0) {
			System.out.println("Erreur");
		}
		else {
			int resultat = val1 + val2;
			System.out.println("Le résultat est : " + resultat);
		}
	}
}