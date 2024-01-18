package first_package;

public class Operator1 {

	public static void main(String[] args) {
		// + 더하기
		// - 빼기
		// * 곱하기
		// / 나누기
		// % 나머지

		int a, b, wa, sa, seki, syo, amari;
		
		a = 100;
		b = 3;
		wa = a+b;
		sa = a-b;
		seki = a*b;
		syo = a/b;
		amari = a%b;
		
		System.out.println("----정수 계산----");
		System.out.println("a+b = "+wa);
		System.out.println("a-b = "+sa);
		System.out.println("a*b = "+seki);
		System.out.println("a/b = "+syo);
		System.out.println("a%b = "+amari);
	}

}
