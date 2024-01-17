package Exercices;
import java.util.Scanner;

public class exercice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double conversionPouces = 0.393701;
		System.out.println("Veuillez indiquer une longueur en centimètres");
		double longueurcm = sc.nextDouble();
		System.out.println("Votre longueur est égale à " +(longueurcm*conversionPouces)+ " pouces.");
	}
}