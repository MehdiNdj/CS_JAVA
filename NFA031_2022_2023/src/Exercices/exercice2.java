package Exercices;
import java.util.Scanner;

public class exercice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double valeurUSD = 1.02;
		
		System.out.println("Entrez votre somme en euros");
		double sommeEur = sc.nextDouble();
		System.out.println(sommeEur+ "€ est égal à " +(sommeEur*valeurUSD)+ "$.");
	}
}
