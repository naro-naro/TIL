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
		
		System.out.print("섭씨 온도를 정수로 입력하세요:");
		try{
			Celsius=input.nextInt();
			}
		catch(Exception e) {
			System.out.println("입력오류입니다. 프로그램이 종료됩니다.");
			return;
	}
		System.out.println("입력하신 섭씨온도는 화씨온도로 "+ConvertToFahrenheit(Celsius)+"입니다.");
		ConvertToFahrenheit(Celsius);
	
	}
	
	public static double ConvertToFahrenheit(int Celsius) {
		
		double Fahrenheit=32+9/5.0*Celsius;
		return Fahrenheit;
				
	}
	

}

