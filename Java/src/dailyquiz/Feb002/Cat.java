package dailyquiz.Feb002;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		// 추상메소드 재정의
		System.out.println("야옹");
	}
}
