package doitJava.ch04;

public class Break1 {

	public static void main(String[] args) {
		// 1부터 더해가면 언제 100을 넘기는지 알아보기
		
		int num = 0;
		int sum = 0;
		
		for (num = 0; sum < 100; num++) {
			sum += num;
			}
		
		System.out.println("num : " + num);
		System.out.println("sum : " + sum); // 100을 넘긴 순간 더이상 반복하지 않고 출력

	}

}
