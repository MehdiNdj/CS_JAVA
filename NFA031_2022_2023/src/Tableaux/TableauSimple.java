package Tableaux;

import java.util.Arrays;

public class TableauSimple {

	public static void main(String[] args) {
		int []nbEtud; //* crochets avant ou après
		int tab [] = {1,2,3,50};
		int tab2[] = {(2*100), (4-2), (5*9)};
		double[] tab3;
		tab3 = new double[4]; //* prévoit 4 cases
		tab3[0]=10;
		tab3[1]=20;
		tab3[2]=30;
		tab3[3]=40;
		//* System.out.println(tab); //* affiche l'adresse du tableau
		
		/* for (int i=0; i<tab.length; i++) {
			System.out.println(tab[i]);
		}
		for (double toto:tab3) {
			System.out.println(toto);
		}
		*/
		System.out.println(Arrays.toString(tab3));
	}
}
