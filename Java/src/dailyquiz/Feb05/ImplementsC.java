package dailyquiz.Feb05;

public class ImplementsC implements InterfaceC {
	@Override
	public void methodA() {
		System.out.println("A메소드 실행"); // InterfaceA의 메소드도 구현필요
	}
	
	@Override
	public void methodB() {
		System.out.println("B메소드 실행"); // InterfaceB의 메소드도 구현필요
	}
	
	@Override
	public void methodC() {
		System.out.println("C메소드 실행");
	}
}
