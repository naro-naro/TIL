/* 1. This program shows converting Cel to Fah by using Method.
 * 2. Nov,20,2019
 * 3. Programmer: SY,Park.
 *    Student number:201901562*/
package homework;
import java.util.Scanner;
public class Method {

	public static void main(String[] args) {
		int Celsius;
		Scanner input=new Scanner(System.in);
		
		System.out.print("���� �µ��� ������ �Է��ϼ���:");
		try{
			Celsius=input.nextInt();
			}
		catch(Exception e) {
			System.out.println("�Է¿����Դϴ�. ���α׷��� ����˴ϴ�.");
			return;
	}
		System.out.println("�Է��Ͻ� �����µ��� ȭ���µ��� "+ConvertToFahrenheit(Celsius)+"�Դϴ�.");
		ConvertToFahrenheit(Celsius);
	
	}
	
	public static double ConvertToFahrenheit(int Celsius) {
		
		double Fahrenheit=32+9/5.0*Celsius;
		return Fahrenheit;
				
	}
	

}

