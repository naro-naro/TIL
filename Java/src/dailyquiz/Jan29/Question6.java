package dailyquiz.Jan29;

public class Question6 {

	public static void main(String[] args) {
		// 아래 코드의 실행 결과가 true가 되도록 수정해보세요.
        String str1 = new String("Hello world!");
        String str2 = new String("Hello world!");
        
        // System.out.println(str1 == str2); : 참조 비교 false
        
        System.out.println(str1.equals(str2)); // : 문자열만 비교

	}

}
