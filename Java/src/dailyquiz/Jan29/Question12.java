package dailyquiz.Jan29;

public class Question12 {

	public static void main(String[] args) {
		// 문제 : 비트 연산자
		int a = 5; // 0101 in binary
		int b = 3; // 0011 in binary
		int result = a & b;
		// 0001(2) == 1
		System.out.println(result);
		
		// cf. 2진수 프린트 : 
		System.out.println(Integer.toBinaryString(result));
	}

}
