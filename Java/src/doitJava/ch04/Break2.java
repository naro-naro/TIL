package doitJava.ch04;

public class Break2 {

	public static void main(String[] args) {
		// 1부터 더해가면 언제 100을 넘기는지 알아보기
		
		int num = 0;
		int sum = 0;
		
		for (num = 0; ; num++) { // 조건문을 생략하는 대신
			sum += num;
			if (sum >= 100) {
				break;			// break문을 사용
				// sum이 100보다 크거나 같을 떄 종료하고 반복문 중단
			}
			}
		
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}

}
