package gugudan;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		int num  = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("원하시는 구구단 열을 입력해주세요: ");
		num = scan.nextInt();
		if (num < 10) {
			for (int i = 0; i <= 9; i++) {
				System.out.println(num+" * "+i+" = "+num*i);
			}	
		}
		else {
			System.out.println("9보다 큰 값을 입력하셨습니다.");
		}
	}
}