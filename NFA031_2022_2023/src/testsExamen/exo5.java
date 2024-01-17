package testsExamen;
import java.util.ArrayList;
import java.util.Collections;

public class exo5 {
	public static void main(String[] args) {
		ArrayList<String> ListeDeCourse = new ArrayList<String>();
		ListeDeCourse.add("sucre");
		ListeDeCourse.add("farine");
		ListeDeCourse.add("lait");
		ListeDeCourse.add("oeufs");
		ListeDeCourse.add("salade");
		ListeDeCourse.add("jus");
		ListeDeCourse.add(0, "escalope de dinde");
		System.out.println(ListeDeCourse);
		ListeDeCourse.set(5,"deux packs de vittel");
		System.out.println(ListeDeCourse);
		System.out.println(ListeDeCourse.get(2));
		ListeDeCourse.remove(1);
		for (int i = 0; i < ListeDeCourse.size(); i++) {
			System.out.println(ListeDeCourse.get(i));
		}
		Collections.sort(ListeDeCourse);
		System.out.println(ListeDeCourse);
		Collections.reverse(ListeDeCourse);
		System.out.println(ListeDeCourse);
		ArrayList<String>ListeDeCourseFinale = new ArrayList<String>();
		ListeDeCourseFinale = (ArrayList<String>)ListeDeCourse.clone();
		System.out.println("Liste avant mélange");
		System.out.println(ListeDeCourseFinale);
		Collections.shuffle(ListeDeCourseFinale);
		System.out.println("Liste après mélange");
		System.out.println(ListeDeCourseFinale);
	}
}
