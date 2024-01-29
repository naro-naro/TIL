package dailyquiz.Jan29;

public class Question4 {

	public static void main(String[] args) {
		// 아래 코드의 출력값은 무엇일까요?
        int num1 = 5;
        int num2 = 7;

        System.out.println((num1 > 5) && (num2 > 5)); // f && t == f
        System.out.println((num1 > 5) || (num2 > 5)); // f || t == t
        System.out.println(!((num1 > 5) && (num2 > 5))); // !(f && t) == !f == t
	}

}
