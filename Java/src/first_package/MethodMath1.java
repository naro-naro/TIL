package first_package;

public class MethodMath1 {

	public static void main(String[] args) {
		// Math : 수학 처리 클래스
		double sin;
		
		// 사인 30도는 이렇게해서는 구할 수 없다
		sin = Math.sin(30);
		System.out.println(sin);
		
		// 이렇게 하면 사인 30도를 구할 수 있지만
		// Math.PI : 원주율 3.14159...
		sin = Math.sin(30.0 * Math.PI / 180.0);
		System.out.println(sin);
		
		// 이렇게 하는 게 더 편리
		// Math.toRadians() : 도수 단위를 Radian단위로 변환하는 메소드
		sin = Math.sin(Math.toRadians(30));
		System.out.println(sin);
	}

}
