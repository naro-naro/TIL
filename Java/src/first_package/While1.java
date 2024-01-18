package first_package;

import java.util.Scanner;
public class While1 {

	public static void main(String[] args) {
		int num1, num2, gcd =0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("num1 : ");
		num1 = input.nextInt();
		
		System.out.print("num2 : ");
		num2 = input.nextInt();
		
		int i = 1;	// 초기값
		while (i<=num1) { // 끝값
			if ((num1%i==0) && (num2%i==0)) {
				gcd = i;
			}
			i= i+1; // 증감
		}
		
		System.out.println("최대공약수 : "+gcd);
	}

}
