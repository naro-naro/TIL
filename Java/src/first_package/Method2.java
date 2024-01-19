package first_package;

import java.util.Scanner;
public class Method2 {

	public static void main(String[] args) {
		int num1, num2;
		int small;
		Scanner input = new Scanner(System.in);
		
		System.out.print("num1 : ");
		num1 = input.nextInt();
		
		System.out.print("num2 : ");
		num2 = input.nextInt();
		
		small = which_is_smaller(num1, num2);
		System.out.println("The smaller one is "+small);

	}

	
	public static int which_is_smaller(int a, int b) {
		if (a<b)  return a;	
		else  return b;
		
	}
	
}
