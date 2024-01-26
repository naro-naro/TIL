package dailyquiz.Jan26;

public class Question13 {

	public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1 == str2); // 출력 결과는 무엇일까요? false
        // 이유 : str1 str2이 다른 참조를 갖기 때문에 false
        
        // 문자열의 내용을 비교하려면 .equals()를 이용하자!
        System.out.println(str1.equals(str2)); // 출력: true

	}

}
