package first_package;

import java.util.Scanner;
public class For5 {

	public static void main(String[] args) {
		// 최대공약수 찾기
		
		int num1, num2, gcd = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("num1 : ");
		num1 = input.nextInt();

		System.out.print("num2 : ");
		num2 = input.nextInt();
		
		for (int i=1; i<=num1; i++) {
			if((num2%i==0) && (num1%i==0)) {
				gcd = i;
			}
		}
		System.out.println("최대공약수 : " + gcd);
	}

}
