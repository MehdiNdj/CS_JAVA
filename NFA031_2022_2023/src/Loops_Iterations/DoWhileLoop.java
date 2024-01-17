package Loops_Iterations;
import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int prixUtilisateur, prixAdeviner;
			prixAdeviner = (int) (Math.random()*500);
			System.out.println(prixAdeviner);
			System.out.println("Veuillez saisir un prix entre 0 et 500");
			
			do { //* permet d'exécuter une première fois l'action sans vérifier la condition while
				prixUtilisateur = sc.nextInt();
				
				if (prixUtilisateur == prixAdeviner) {
					System.out.println("C'est juste");
				}
				else if (prixUtilisateur < prixAdeviner) {
					System.out.println("C'est plus");
				}
				else if (prixUtilisateur > prixAdeviner) {
					System.out.println("C'est moins");
				}
			}
			while(prixUtilisateur != prixAdeviner);
	}
}
