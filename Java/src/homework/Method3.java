/* 1. This program shows getting GCD by using Method without return&factor.
 * 2. Nov,24,2019
 * 3. Programmer: SY,Park.  Student number:201901562 */
package homework;
public class Method3 {
public static void main(String[] args) {
			gcdMethod(100, 60);
			gcdMethod(100.0, 60.0);
			gcdMethod(100, 60 ,20);
            gcdMethod(100, 60, 20, 85);
			}
public static void gcdMethod(int a, int b) {
				int gcd=0;
				for(int i=1; i<=b; i++) {
					if((a%i==0)&&(b%i==0)) 
						gcd=i;}
					System.out.println("100과 60의 gcd는 "+gcd);
				}
public static void gcdMethod(double a, double b) {
	int gcd=0;
	for(int i=1; i<=b; i++) {
		if((a%i==0)&&(b%i==0)) 
			gcd=i;}
		System.out.println("100.0과 60.0의 gcd는 "+gcd);
	}
public static void gcdMethod(int a, int b, int c) {
	int gcd=0;
	for(int i=1; i<=c; i++) {
		if((a%i==0)&&(b%i==0)&&(c%i==0)) 
			gcd=i;}
		System.out.println("100과 60과 20의 gcd는 "+gcd);
	}
public static void gcdMethod(int a, int b, int c, int d) {
	int gcd=0;
	for(int i=1; i<=c; i++) {
		if((a%i==0)&&(b%i==0)&&(c%i==0)&&(d%i==0)) 
			gcd=i;}
		System.out.println("100과 60과 20과 85의 gcd는 "+gcd);
			}
}