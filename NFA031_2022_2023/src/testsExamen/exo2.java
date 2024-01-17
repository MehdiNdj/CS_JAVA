package testsExamen;
import java.util.Scanner;
import java.util.ArrayList;

public class exo2 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisissez le nombre d'entiers que vous voulez");
		int total = clavier.nextInt();
		System.out.println("Saisissez vos nombres");
		int tab [] = new int [total];
		
		for (int i = 0; i < total; i++){
			tab [i] = clavier.nextInt();
		}
		afficherTableau(tab);
	}
	public static void afficherTableau(int tab[]) {
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab [i]);
		}
	}
}
