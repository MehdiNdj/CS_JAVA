package Methodes;

public class Methodes {

	public static void main(String[] args) {
		int joueur0[] = {1,2,3,4,5};
		int joueur1[] = {0,0,3,5,9};
		int joueur2[] = {10,10,10,10,19};
		afficherTab(joueur0);
		afficherTab(joueur1);
		afficherTab(joueur2);
	}
	
	public static void afficherTab (int [] toto) {
		for (int i = 0; i < toto.length; i++) {
			System.out.println(toto[i]);
			}
		}
}
