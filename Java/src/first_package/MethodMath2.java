package first_package;

public class MethodMath2 {

	public static void main(String[] args) {
		// 자연대수 E = 2.718281828459045
		double E;
		E = Math.E;
		System.out.println(E);
		
		
		// 각도 변환
		// 도수 -> Radian
		double toR;
		toR = Math.toRadians(30);
		System.out.println(toR);
		
		// Radian -> 도수
		double toD;
		toD = Math.toDegrees(toR);
		System.out.println(toD);
		
	}

}
