package first_package;

public class While2 {

	public static void main(String[] args) {
		// 1부터 100까지의 합 구하기
		int sum=0;
		int i =1;	// 초기값
		while(i<=100) {	// 끝값
			sum = sum+i;
			i++;	// 증감
		}
		System.out.println("sum : "+sum);
	}

}
