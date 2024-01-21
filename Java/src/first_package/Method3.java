package first_package;

public class Method3 {

	public static void main(String[] args) {
		System.out.println((10));
		Convert2(100);
		Convert3();

	}

	// 리턴값이 있고(int, double, String, ...), 인수가 있는 메소드
	public static double Convert1(int Celsius) {
		double Fahrenheit = Celsius*1.8 + 32;
		return Fahrenheit;
	}
	
	
	// 리턴값이 없고(void), 인수가 없는 메소드
	public static void Convert2(int Celsius) {
		double Fahrenheit = Celsius*1.8 + 32;
		System.out.println(Fahrenheit);
	}
	
	
	// 리턴값이 없고, 인수가 없는 메소드
	public static void Convert3() {
		System.out.println("Fahrenheit = Celsius*1.8 + 32");
	}
	
	
}
