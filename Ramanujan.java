public class Ramanujan{
	public Ramanujan() {
		float pi = 0;
		
		for (int i = 0; i < 30; i++) {
			pi += (double)(factorial(4*i)*(1103+(26390*i)))/((Math.pow(factorial(i), 4))*Math.pow(396, (4*i)));
			}
		pi *= ((2*Math.sqrt(2))/9801);
		pi = (float) Math.pow(pi, -1);
		System.out.println(pi);
	}
	
	public int factorial(int n) {
		int num = 1;
		
		for (int i = n; i > 0; i--) {
			num *= i;
		}
	    return num;
	}
}
