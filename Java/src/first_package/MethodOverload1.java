package first_package;

public class MethodOverload1 {

	public static void main(String[] args) {
		int imax1, imax2, i1=100, i2=200;
		double dmax1, dmax2, d1=0.5, d2=0.7;
		
		imax1 = maxData(i1, i2);
		imax2 = maxData(300, 400);
		
		dmax1 = maxData(d1, d2);
		dmax2 = maxData(Math.PI, 3.14);
		
		System.out.println("The bigger one is "+imax1);
		System.out.println("The bigger one is "+imax2);
		
		System.out.println("The bigger one is "+dmax1);
		System.out.println("The bigger one is "+dmax2);
	}

	
	// 메소드 다중 정의 (오버로드)
	// 받는 인수 타입이 다른 두 메소드를 같은 이름을 써서 정의
	
	// int형 인수를 받아 사용하는 maxData
	public static int maxData(int a, int b){
		if (a>b) return a;
		else return b;
	}
	
	// double형 인수를 받아 사용하는 maxData
	public static double maxData(double a, double b){
		if (a>b) return a;
		else return b;
	}
}
