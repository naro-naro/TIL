package first_package;

public class Var3 {

	public static void main(String[] args) {
		double pi = 3.14;
		double dt = Math.PI;
		//자바에서 제공하는 원주율값
		double r = 10.0;
		double area = r*r*pi;
		double area2 = r*r*dt;
		System.out.println("반지름이 "+r+"인 원의 넓이는 "+area+"입니다.");
		System.out.println("반지름이 "+r+"인 원의 넓이는 정확히는 "+area2+"입니다.");

	}

}
//유리수 변수는 double
