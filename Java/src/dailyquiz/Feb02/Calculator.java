package dailyquiz.Feb02;

// 부모클래스
public class Calculator {
	private static final double PI = 3.14159;
	
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return r * r *PI;
	}

}
