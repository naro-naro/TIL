/* 1. This program shows judging Armstrong Number by using Method.
 * 2. Nov,24,2019
 * 3. Programmer: SY,Park.  Student number:201901562 */
package homework;
public class Method5 {
	public static void main(String[] args) {
		int num1;
		System.out.println("100���� 999������ ArmStrong���� "+armStrongNumber2(num1)+"�Դϴ�.");
		armStrongNumber2(num1);   
				
	}
	public static int armStrongNumber2(int a) {
		int x,y,z; int asn;
		x=a/100%10;
		y=a/10%10;
		z=a%10;
		asn=(int)Math.pow(x, 3) + (int)Math.pow(y, 3) + (int)Math.pow(z, 3);
		for(double i=100; i<=999; i++) {
			i=asn;
			}
		return asn;
	}
}
