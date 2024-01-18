package first_package;

// 1. Scanner is in the java.util package
import java.util.Scanner;
public class Input1 {

	public static void main(String[] args) {
		String name;
		
		// 2. Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a name
		System.out.print("Enter your name : ");
		
		// 3. Use the methods next(), nextByte(), nextShort(), nextInt(), nextLong(), nextFloat(), nextDouble(), nextBoolean()
		// to obtain to a string, byte, short, int, long, float, double, boolead value
		name = input.next();
		
		// Display result
		System.out.println("Hello, " + name + ". Nice to meet you! ");
		
	}

}
