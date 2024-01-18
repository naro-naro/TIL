package first_package;

import java.util.Scanner;
public class If2 {

	public static void main(String[] args) {
		int a, b, c;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value of a : ");
		a = input.nextInt();
		
		if(a>10) {
			b =1;
			c =2;
		}
		else {
			b =3;
			c =4;
		}
		
		System.out.println("b : " +b);
		System.out.println("c : " +c);

	}

}
