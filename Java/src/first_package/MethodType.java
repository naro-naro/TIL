package first_package;

public class MethodType {

	public static void main(String[] args) {
		// 자료형 변환 메소드
		int i;
		String str;
		double d;
		
		// 문자열을 double로 변환
		str = "345.678";
		d = Double.parseDouble(str);
		d += 1000;
		System.out.println(d);
		
		// 정수를 16진수로 표현
		i = 1000;
		// 16진수 소문자
		str = Integer.toHexString(i);
		System.out.println(str);
		// 16진수 대문자
		str = Integer.toHexString(i).toUpperCase();
		System.out.println(str);
	}

}
