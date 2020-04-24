import java.util.Scanner;

public class pi {
	public static void main(String[] args) {
		float pi = 0;
		
		for (int i = 1; i < 1000000; i++) {
			pi += Math.pow(-1, i+1) / (2*i - 1);
		}
		System.out.println(pi * 4);
	}
}