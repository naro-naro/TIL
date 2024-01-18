package first_package;

import java.util.Scanner;
public class If4 {

	public static void main(String[] args) {
		int price;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price : ");
		price = input.nextInt();
		
		if (price>=1000) price = price - 100;
		else if (price>=600) price = price - 50;
		else if (price>=300) price = price - 20;
		else price = price - 10;

		System.out.println("The price is "+price);
	}

}
