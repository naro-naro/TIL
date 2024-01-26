package dailyquiz.Jan26;

public class Question11 {

	public static void main(String[] args) {
		int a = 500;
        Integer b = 500;

        System.out.println(a == b); // 출력 결과는 무엇일까요? true
        // 이유 : 자동 UuBoxing
        // Integer로 선언된 변수들이 -128~127사이라면 다 같은 참조값
        // Question14과 비교!

	}

}
