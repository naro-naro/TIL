package dailyquiz.Jan26;

public class Question14 {

	public static void main(String[] args) {
        Integer a = 1000;
        int b = a;
        Integer c = b;

        System.out.println(a == c); // 출력 결과는 무엇일까요? false
        // Integer로 선언된 변수들이 -128~127사이라면 다 같은 참조값
        
        
        
        Integer aa = 100;
        int bb = aa;
        Integer cc = bb;

        System.out.println(aa == cc); // 출력 결과는 무엇일까요? true
        // Integer로 선언된 변수들이 -128~127사이이기 때문에 같은 참조값이라서.
	}

}
