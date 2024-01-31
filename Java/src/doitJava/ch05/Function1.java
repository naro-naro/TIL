package doitJava.ch05;

public class Function1 {

	public static void main(String[] args) {
		int sum;
		sum = add(10, 20); // add() 함수 호출
		
		System.out.println("10 + 20 = " + sum);
		
	}
	
	
	// 함수 정의하기
	public static int add (int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}

}
