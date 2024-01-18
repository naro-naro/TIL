package first_package;

// Scanner in in the java.util package
import java.util.Scanner;
public class Input2 {

	public static void main(String[] args) {
		double radius, area;
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a radius
		System.out.print("Enter a number for redius : ");
		radius = input.nextDouble();
		
		// Compute area
		area = radius * radius * 3.14159;
		
		// Display result
		System.out.println("The area for the circle of radius " + radius + " is " + area);

	}

}
