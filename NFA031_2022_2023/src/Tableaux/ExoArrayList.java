package Tableaux;
import java.util.ArrayList;

public class ExoArrayList {

	public static void main(String[] args) {
		ArrayList<String>Etudiant = new ArrayList<String>();
		ArrayList<Integer>Notes = new ArrayList<Integer>();
		ArrayList<Double>Prix = new ArrayList<Double>();
		
		Etudiant.add("Franck");
		Etudiant.add("Michel");
		Etudiant.add(0, "Sofia");
		Etudiant.add(3, "Solange");
		System.out.println(Etudiant.size());
		System.out.println(Etudiant);
		//* Etudiant.remove(0);
		Etudiant.set(0, "Sophia");
		System.out.println(Etudiant);
		System.out.println(Etudiant.get(1));
		/*
		System.out.println(Etudiant.size());
		System.out.println(Etudiant.contains("Franck"));
		//* Etudiant.removeAll(Etudiant);
		System.out.println(Etudiant.isEmpty());
		System.out.println(Etudiant.get(1));
		System.out.println("Voici les étudiants " + Etudiant); */
	}

}
