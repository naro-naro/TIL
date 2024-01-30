package doitJava.ch04;

public class DoWhile {

	public static void main(String[] args) {
		// do - while 문으로 1~10까지 더하는 프로그램
		int i = 1;
		int sum = 0;
		
		do {			// 조건식이 참이 아니라고 무조건 한 번 수행함
			sum += i;
			i++;
		} while (i <= 10); // 참이라면 do 실행문 수행
		
		System.out.println("1 + 2 + ... + 9 + 10 = " + sum);
	}

}
