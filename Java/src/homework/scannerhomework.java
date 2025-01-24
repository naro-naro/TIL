/*
 * 1. This program shows Scanner.
 * 2. Oct,14,2019
 * 3. Programmer:SY,Park.
 *    Student number:201901562
 */
package homework;
 import java.util.Scanner;
  public class scannerhomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double investment,period,interest,total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number for investment :");
		investment = input.nextDouble();
		
		System.out.print("Enter a number for period :");
		period = input.nextDouble();
		
		System.out.print("Enter a number for interest :");
		interest = input.nextDouble();
		
		total = investment*Math.pow(1+interest,period);
		
		System.out.println("When the investment is "+investment+",");
		System.out.println("the period is "+period+",");
		System.out.println("the interest is "+interest+",");
		System.out.println("The total is "+(int)total+".");
		

	}

}
