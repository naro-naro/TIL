package first_package;

import java.util.Scanner;
public class If3 {

	public static void main(String[] args) {
		int a, b, c;
		b=100;
		c=100;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value of a : ");
		a = input.nextInt();
		
		if(a>50) {
			b=0;
		}
		if((int)(a%2) ==0) {
			c=1;
		}
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}

}
