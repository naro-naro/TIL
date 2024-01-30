package doitJava.ch03;

public class Operation04 {

	public static void main(String[] args) {
		// 비트 연산자
		
		// & : 두 비트 값이 모두 1일때 1
		int num1 = 5; 		 	//  101(2)
		int num2 = 10; 			// 1010(2)
		int result = num1 & num2;	// 0000(2)		
		System.out.println(result);
		
		// | : 두 비트 값이 하나라도 1이면 1
		result = num1 | num2;	// 1111(2)		
		System.out.println(result);
		
		// ^ : 두 비트 값이 같으면 0, 다르면 1
		result = num1 ^ num2;	// 1		
		System.out.println(result);
		
		// ~ : 비트값 반전
		num1 = 10; 		// 00001010(2)
		result = ~num1;	// 11110101(2)		
		System.out.println(result);

	}

}
