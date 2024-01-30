package doitJava.ch03;

public class Operation05 {

	public static void main(String[] args) {
		// 비트 연산자
		int num = 5; // 00000101(2)
		
		// << : 왼쪽으로 비트 이동
		// num<<2 : 00010100(2) = 20
		System.out.println(num<<2);
		
		// >> : 오른쪽으로 비트 이동
		// num>>1 : 00000010(2) = 2
		System.out.println(num>>1);

	}

}
