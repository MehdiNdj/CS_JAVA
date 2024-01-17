package Loops_Iterations;

public class BasicLoop_Iteration {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i <= 19; i++) {
			System.out.println(i);
			Thread.sleep(1000); //* 1 sec
		}		
	}
}
