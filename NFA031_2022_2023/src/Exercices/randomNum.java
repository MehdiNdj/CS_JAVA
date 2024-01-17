package Exercices;
import java.util.Scanner;

public class randomNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int randomNum = (int)(Math.random()*3);
		System.out.println("Veuillez saisir un nombre");
		int propo = sc.nextInt();
		
		while (propo != randomNum)
		{
			System.out.println("Nombre incorrect, veuillez réessayer");
			propo = sc.nextInt();
		}
		if (propo == randomNum){
			System.out.println("Vous avez saisi le bon nombre.");
		}
	}
}