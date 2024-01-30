package doitJava.ch02;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum; // 묵시적 형 변환 : 작은 -> 큰
		
		System.out.println(bNum);
		System.out.println(iNum);

		int iNum2 = 20;
		float fNum = iNum2; // 묵시적 형 변환 : 모호(정수) -> 구체(실수)
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum = fNum + iNum;
		System.out.println(dNum);
		
	}

}
