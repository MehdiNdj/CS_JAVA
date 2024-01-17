package tpHeritage;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Personne personne1 = new Personne("Martin", "¨Pierre", 30);
		Personne etudiant1 = new Etudiant("Dupont", "Paul", 20, "Licence 3", 13.5);
		Etudiant etudiant2 = new Etudiant("Dupont1", "Paul1", 21, "Licence 2", 13.5);
		Professeur professeur1 = new Professeur("Fermat", "Pierre", 45, "Maths", 225);
		
		System.out.println(personne1);
		System.out.println("*******************************************");
		System.out.println(etudiant1);
		System.out.println("*******************************************");
		System.out.println(etudiant2);
		System.out.println("*******************************************");
		System.out.println(professeur1);
		
		List<Personne> personnes = new ArrayList<>();
		personnes.add(personne1);
		personnes.add(etudiant1);
		personnes.add(etudiant2);
		personnes.add(professeur1);
		
		System.out.println("*******************************************");
		personnes.forEach(s -> System.out.println(s)); // à partir de JDK 8 lambda expression
	}

}
