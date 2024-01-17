package testsExamen;
import java.util.Scanner;
import java.util.ArrayList;

public class exo1 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		ArrayList<Integer>nombres = new ArrayList<Integer>();
		System.out.println("Saisissez le nombre d'entiers que vous voulez");
		int total = clavier.nextInt();
		System.out.println("Saisissez vos nombres");
		
		for (int i = 0; i < total; i++){
			nombres.add(clavier.nextInt());
		}
		System.out.println(nombres);
	}
}
