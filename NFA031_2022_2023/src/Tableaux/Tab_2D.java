package Tableaux;

public class Tab_2D {

	public static void main(String[] args) {
		int tab [][] = {{1,2,3},{3,4,5},{6,7,8}};
		
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) { 
				System.out.println(tab[i][j]);
			}
		}
	}

}
