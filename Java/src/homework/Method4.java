/* 1. This program shows judging Armstrong Number by using Method.
 * 2. Nov,24,2019
 * 3. Programmer: SY,Park.  Student number:201901562 */
package homework;
import java.util.Scanner;
public class Method4 {
	public static void main(String[] args) {
		int num1;
		Scanner input=new Scanner(System.in);
		
		for(;;){ //begin for
		System.out.print("���ڸ� ������ �Է��ϼ���: ");
		num1=input.nextInt();
		  
		}//End
		armStrongNumber(num1);
		if(num1==armStrongNumber(num1)) {
		    System.out.println("�Է��Ͻ� ���� ArmStrong���� �½��ϴ�.");
		    System.out.println();}
		else{
			System.out.println("�Է��Ͻ� ���� ArmStrong���� �ƴմϴ�.");
			System.out.println();}
		}
				

	public static double armStrongNumber(int a) {
		double x,y,z; int asn;
		x=a/100%10;
		y=a/10%10;
		z=a%10;
		asn=(int)(Math.pow(x, 3) + Math.pow(y, 3) + Math.pow(z, 3));
		return asn;
	}
}
