package dailyquiz.Feb002;

// 추상클래스 정의
public abstract class Animal {
	protected String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
	// 추상메소드 : 메소드의 타입과 이름만 정의
}
