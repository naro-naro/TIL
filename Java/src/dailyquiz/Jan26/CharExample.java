package dailyquiz.Jan26;

public class CharExample {

	public static void main(String[] args) {
		char ch = 'A';
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + "는 대문자입니다.");
		} else {
			System.out.println(ch + "는 대문자가 아닙니다.");
		}

	}

}

/*
 * char : 문자 처리
 * 문자 처리에서는 char 타입을 사용한다.
 * 사용자로부터 입력받은 문자가 대문자인지, 소문자인지 확인하는 코드
 */