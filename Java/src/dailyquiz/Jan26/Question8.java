// -*- coding: utf-8 -*-

package dailyquiz.Jan26;

public class Question8 {

	public static void main(String[] args) {
		// 8. ‘가’라는 한글 문자의 유니코드를 찾아서 char 타입의 변수로 만들어봅시다.
		char ga = '가';
		System.out.println((int)ga);

		ga = '\uAC00';
		System.out.println(ga);
		
		char a = 'a';
		System.out.println((int)a);

		a = '\u0061';
		System.out.println(a);
	}

}
