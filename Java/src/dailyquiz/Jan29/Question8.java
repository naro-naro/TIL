package dailyquiz.Jan29;

public class Question8 {

	public static void main(String[] args) {
		// 문제 : 증감연산자
		int x = 5;
		int y = x++ + ++x;
		// x++ : y에게 x를 대입하고 x에 +1
		// ++x : x에 +1 하고나서 대입
		// y = 5 + 7
		System.out.println(y);

	}

}
