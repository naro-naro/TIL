package first_package;

public class Opetator5 {

	public static void main(String[] args) {
		// && 논리곱 and
		// || 논리합 or 
		// ! 부정 not
		
		int a, b;
		a=3; b=4;
		
		if (a==3 && b==4) {
			System.out.println("a=3 and a=4");
		}
		if (a==3 || b==0) {
			System.out.println("a==3 or b==0");
		}
		if (!(a==10 && b==100)) {
			System.out.println("a!=10 and a!=100");
		}
	}

}
