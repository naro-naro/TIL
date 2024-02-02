package dailyquiz.Feb01;

public class Calculator {
	int a;
	
	double divide(int x, int y) { // x, y는 매개변수
		return (double) x / y;
	}
	
	int postfixOperator(int a) {
		a++;
		return a;
	}
	
	void postfixOperator2() {
		this.a++;
	}
	
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		// 10, 20은 인수
		System.out.println(calculator.divide(10, 20));
		
		/*
		calculator.postfixOperator(a);
		System.out.println(a); 
		 2가 나올 것 같지만 1이 출력된다
		 이유 : 메소드 안에서 사용한 매개변수는 메소드 안에서만 쓰이기 때문
		 */
		
		int a = 1;
		a = calculator.postfixOperator(a);
		System.out.println(a);

		Calculator cal = new Calculator();
		cal.a = 1;
		cal.postfixOperator2();
		System.out.println(cal.a);
	}

}
