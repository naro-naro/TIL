package doitJava.ch02;

public class ExplicitConversion {

	public static void main(String[] args) {
		// 큰 -> 작은
		// 자세 -> 모호
		
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		
		int iNum3 = (int)dNum1 + (int) fNum2;
		int iNum4 = (int)(dNum1 + fNum2);
		
		System.out.println(iNum3); // 1.2 + 0.9 -> 1 + 0 = 1
		System.out.println(iNum4); // 2.1 -> 2

	}

}
