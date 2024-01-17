package ExoIntro;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double distance () {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}
	@Override
	public String toString() {
		return "La distance entre l'origine et le point : (" + x + ", " + y + ") est : " + this.distance();
	}
	
}
