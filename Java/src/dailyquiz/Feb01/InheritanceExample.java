package dailyquiz.Feb01;

public class InheritanceExample {

	public static void main(String[] args) {
		InheritB b = new InheritB();
		
		b.field1 = 10;
		b.method1(); // InheritA로부터 물려받은 필드와 메소드

		b.field2 = "홍길동";
		b.method2(); // InheritB에서 추가한 필드와 메소드
	}

}
