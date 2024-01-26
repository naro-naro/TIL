package dailyquiz.Jan26;

public class CircleArea {

	public static void main(String[] args) {
		double radius = 7.5; // 원의 반지름
		double area = Math.PI * Math.pow(radius, 2.0);
		// Math.PI : 원주율 3.1415...
		// Math.pow (a,b) : a**b a의 b제곱
		
		System.out.println("반지름이 "+radius+"인 원의 넓이는 "+area+"입니다.");
	}

}
/*
 * float / double : 과학적 계산
 * float와 double은 소수점을 포함하는 실수를 다룰 때 사용된다
 * 원의 면적을 계산하는 프로그램
 */