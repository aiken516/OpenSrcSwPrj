public class Euler {
	public Euler() {
		float pi = 0;
		
		for (int i = 1; i < 10000; i++) {
			pi += 1 / Math.pow(i, 2);
		}
		System.out.println(Math.sqrt(pi * 6));
	}
}
