package dailyquiz.Jan30;

public class Practice4 {

	public static void main(String[] args) {
		// 이중 for문으로 구구단 출력 (2단 ~ 9단)
		for (int i=2; i<10; i++) { // 2단 ~ 9단
			System.out.println("*** "+i+"단 ***");
			for (int j=1; j<10; j++) { // * 1 ~ 9
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}

	}

}
