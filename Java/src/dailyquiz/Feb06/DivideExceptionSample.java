package dailyquiz.Feb06;

// 0으로 다른 숫자를 나누는 프로그램
public class DivideExceptionSample {
	void finalMessage() {
		System.out.println("그럼 수고하세요~");
	}
	
	public static void main(String[] args) {
		/*
		 -수정 전-
		int result = 5 / 0;
		
		 * java.lang.ArithmeticException : 산술 에러
		 */
		
		
		
		// -수정 후-
		DivideExceptionSample sample = new DivideExceptionSample();
		int result;
		try {
			result = 5 / 0;
			sample.finalMessage(); // 위에서 예외가 발생하므로 이는 실행되지 않음
		} catch(ArithmeticException e) {
			result = -1;
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		} finally {
			sample.finalMessage();
		}
	}

}
