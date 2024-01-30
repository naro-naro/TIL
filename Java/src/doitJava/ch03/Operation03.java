package doitJava.ch03;

public class Operation03 {

	public static void main(String[] args) {
		// 삼항 연산자 (조건 연산자)
		// 조건식 ? 결과1 : 결과2;
		// 조건식의 결과가 참이면 결과1 실행
		// 조건식의 결과가 거짓이면 결과2 실행
		
		int num;
		num = (5>3) ? 10 : 20;
		// 조건식이 true -> num = 10
		System.out.println(num);

	}

}
