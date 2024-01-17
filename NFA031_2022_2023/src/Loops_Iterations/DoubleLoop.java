package Loops_Iterations;

public class DoubleLoop {

	public static void main(String[] args) throws InterruptedException { //* ne pas oublier throws
		
		for (int j = 2; j <= 10; j++) {
			for (int i = 0; i <= 10; i++) {
				System.out.println(j + " x " + i + " = " + j*i);
				Thread.sleep(100);
			}
		}
	}
}