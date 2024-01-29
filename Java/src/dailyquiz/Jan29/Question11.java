package dailyquiz.Jan29;

public class Question11 {

	public static void main(String[] args) {
		// 문제 : 삼항 연산자
		int x = 5;
		int y = 10;
		int result = (x > y) ? (x + y) : (x - y);
		// if (x>y) x+y;
		// else x-y;
		
		// result = 5-10 = -5
		System.out.println(result);

	}

}
