package first_package;

public class StandardLibraryMethod2 {

	public static void main(String[] args) {
		// 표준 메소드
		int i;
		double d;
		String str;
		
		
		System.out.println("----------수치 처리 메소드");
		
		i = 1234;
		str = ""+i;
		System.out.println("int -> 문자열로 변환 = "+str);
		
		str = "1000";
		i = Integer.parseInt(str);
		System.out.println("문자열 -> int = "+i);
		
		i = 65000;
		str = Integer.toHexString(i);
		System.out.println("16진수 소문자 변환 = "+str);
		
		str = Integer.toHexString(i).toUpperCase();
		System.out.println("16진수 대문자 변환 = "+str);
		
		
		
		System.out.println();
		System.out.println("----------수학 처리 메소드");
		
		d = Math.sin(Math.toRadians(60));
		System.out.println("사인 60도 = "+d);
		
		d = Math.sqrt(2.0);
		System.out.println("2.0의 제곱근 = "+d);
		
		d = Math.random();
		System.out.println("0.0에서 1.0 미만의 난수 = "+d);
	}

}
