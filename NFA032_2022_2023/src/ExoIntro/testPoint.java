package ExoIntro;

public class testPoint {

	public static void main(String[] args) {
		Point[] points = new Point[3];
		
		points[0] = new Point(2,3);
		points[1] = new Point(1,4);
		points[2] = new Point(0,2);
		
		for (Point p : points) {
			System.out.println(p); // System.out.println(p.toString());
		}
	}
}
