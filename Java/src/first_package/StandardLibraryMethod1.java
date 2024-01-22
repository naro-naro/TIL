package first_package;

public class StandardLibraryMethod1 {

	public static void main(String[] args) {
		// 표준 메소드
		
		char ch1, ch2;
		int i1, i2;
		double d1;
		String s1, s2, s3;
		
		
		System.out.println("----------문자열 처리 메소드");
		
		s1 = "ABCDEFGHIJ";
		ch1 = s1.charAt(2); // 문자열에서 2번 문자 추출
		System.out.println("2번째 문자 = "+ch1);

		i1 = s1.length(); // 문자열의 길이
		System.out.println("문자열의 길이 = "+i1);
		
		s2 = s1.substring(3);
		s3 = s1.substring(3, 7);
		System.out.println("부분 문자열 3번째 문자부터 끝까지 = "+s2); // 3번째 문자부터 끝까지
		System.out.println("부분 문자열 3번째 문자부터 7번째 문자 전까지 = "+s3); // 3번쨰 문자부터 7번쨰 문자 전까지
		
		i2 = s1.indexOf("DE");
		System.out.println("문자열 검색 DE의 인덱스 = "+i2);
		
		if (s1.equals("ABCDEFGHIJ"))
				System.out.println("두 문자열은 같다.");
		
		s1 = "abcDEF";
		s2 = s1.toUpperCase();
		s3 = s1.toLowerCase();
		System.out.println("문자열을 대문자로 = "+s2);
		System.out.println("문자열을 소문자로 = "+s3);
		
		
		
		System.out.println();
		System.out.println("----------문자 처리 메소드");
		
		ch1 = '3';
		if (Character.isDigit(ch1)) System.out.println("ch1은 숫자이다.");
		else System.out.println("ch1은 숫자가 아니다.");
		
		ch1 = 'a';
		ch2 = Character.toUpperCase(ch1);
		System.out.println("문자의 대문자화 = "+ch2);
	}

}
