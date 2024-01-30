package doitJava.ch04;

public class While {

	public static void main(String[] args) {
		// while문으로 1부터 10까지 더하기
		int i = 1;
		int sum = 0;
		
		while (i <= 10) {
			sum += i;
			i++;
		}
		
		System.out.println("1 + 2 + ... + 9 + 10 = " + sum);
	}

}
