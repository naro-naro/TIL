package doitJava.ch02;

public class Int01 {

	public static void main(String[] args) {
		// 서로 다른 두 자료형을 더하면 어떻게 될까?
		short sVal = 10;
		byte bVal = 20;
		
		System.out.println(sVal + bVal);
		// 정수값 연산은 4byte를 기본으로 하기 떄문에
		// 더하기 전 모두 int형으로 변환된다
		// 결과값도 int형으로 저장된다

	}

}
