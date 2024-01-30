package doitJava.ch02;

public class Final {

	public static void main(String[] args) {
		// final : 상수 선언
		// 이름은 주로 대문자
		// snake_style
		final int MAX_NUM;
		final int MIN_NUM = 0;
		
		MAX_NUM = 100; // 사용하기 전에 초기화하지 않으면 error 발생
		 
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);

	}

}
