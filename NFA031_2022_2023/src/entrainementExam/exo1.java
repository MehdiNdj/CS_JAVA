package entrainementExam;
import java.util.Scanner;

public class exo1 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Veuillez saisir votre prénom");
		String prenom = clavier.nextLine();
		
		for (int i = 0; i < 100; i++) {	
			System.out.println(prenom);
		}
	}

}
