package dailyquiz.Feb05;

public interface Predator {
	String getFood();
	
	// 디폴트 메소드
	// Tiger, Lion 등의 실제 클래스는 printFood() 메소드를 구현하지 않아도 공통으로 사용할 수 있다
	default void printFood() {
		System.out.printf("my food is %s\n", getFood());
	}
}
