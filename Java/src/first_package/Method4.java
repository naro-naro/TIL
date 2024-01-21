package first_package;

public class Method4 {

	public static void main(String[] args) {
		double n;
		
		startMsg();	// 메세지 표시
		n = getRnd();	// 난수 취득
		n = bai(n);	// n의 값을 2배로 한다
		disp(n);	// n의 값을 표시
	}
	
	
	// 1 리턴값이 없고 인수가 없는 메소드
	public static void startMsg() {
		System.out.println("start");	// 문자열 표시
	}
	
	
	// 2 리턴값이 있고 인수가 없는 메소드
	public static double getRnd() {
		return Math.random();	// 0.0~1.0 사이의 난수를 반환
	}

	
	// 3 리턴값이 있고 인수가 있는 메소드
	public static double bai(double dt) {
		return dt*2;	// 인수의 2배값을 반환
	}
	
	
	// 4 리턴값이 없고 인수가 있는 메소드
	public static void disp(double dt) {
		System.out.println("dt = "+ dt);	// 인수값 표시
	}
}
