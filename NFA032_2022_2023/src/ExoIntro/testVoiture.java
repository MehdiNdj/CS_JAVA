package ExoIntro;

import java.util.ArrayList;
import java.util.List;

public class testVoiture {

	public static void main(String[] args) {
		Voiture voiture1 = new Voiture();
		voiture1.setMarque("BMW");
		voiture1.setPuissance(250);
		voiture1.setVitesse(250);
		
		Voiture voiture2 = new Voiture("MERCEDES", 180, 150);
		Voiture voiture3 = new Voiture("MERCEDES1", 1800, 1500);
		
		System.out.println(voiture2.getVitesse());
		System.out.println(voiture1);
		
		System.out.println(voiture2.getId());
		System.out.println(voiture3.getId());
		
		List<Voiture> listedevoitures = new ArrayList<>();
		listedevoitures.add(voiture1);
		listedevoitures.add(voiture2);
		
		List<String> liste = new ArrayList<>();
		liste.add("toto");
	}

}
