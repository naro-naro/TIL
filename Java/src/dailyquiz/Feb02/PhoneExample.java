package dailyquiz.Feb02;

public class PhoneExample {

	public static void main(String[] args) {
		// new + 생성자로 인스턴스를 생성할 수 없다
		
		SmartPhone sp1 = new SmartPhone("홍길동");
		
		sp1.turnOn(); // Phone의 메소드
		sp1.internetSearch();
		sp1.turnOff(); // Phone의 메소드

	}
}