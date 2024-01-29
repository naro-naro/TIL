package dailyquiz.Jan29;

public class Question9 {

	public static void main(String[] args) {
		// 문제 : 논리연산자와 조건연산자
		boolean a = true, b = false;
		boolean result = a || (b && !a);
		//  t || (f && f)
		//	t || f
		//	t
		System.out.println(result);
	}

}
