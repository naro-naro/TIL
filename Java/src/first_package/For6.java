package first_package;

public class For6 {

	public static void main(String[] args) {
		// 1부터 100까지의 합 구하기
		int sum = 0;
		
		for (int i=1; i<=100; i++) {
			sum = sum+i;
		}
		System.out.println("sum : " + sum);
	}

}
