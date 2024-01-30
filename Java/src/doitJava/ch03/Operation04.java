package doitJava.ch03;

public class Operation04 {

	public static void main(String[] args) {
		// 비트 연산자
		
		// & : 두 비트 값이 모두 1일때 1
		int num1 = 5;  //  101(2)
		int num2 = 10; // 1010(2)
		int sum = num1 & num2;
		//                0000(2)
		
		System.out.println(sum);

	}

}
