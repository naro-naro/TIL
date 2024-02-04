package dailyquiz.Feb02;

// 자식클래스
public class Computer extends Calculator {
	@Override
	// 어노테이션은 생략할 수 있지만 개발자의 실수를 방지
	
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;		
		// Math.PI를 이용해 더 정밀한 계산이 가능해짐
	}
}