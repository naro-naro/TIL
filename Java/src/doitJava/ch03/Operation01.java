package doitJava.ch03;

public class Operation01 {

	public static void main(String[] args) {
		// 단락 회로 평가 실습하기
		// 논리 연산에서 모든 항이 실행되지 않는 경우
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 += 10) < 10) && ((i += 2) < 10);
		// && 둘 다 참이어야 하는데 앞이 거짓이므로 뒤의 연산은 실행되지 않음
		// num1 = 20, i = 2(그대로)
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 += 10) > 10) || ((i += 2) < 10);
		// || 하나라도 참이면 되는데 앞이 참이므로 뒤의 연산은 실행되지 않음
		// num1 = 30, i = 2(그대로)
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);

	}

}
