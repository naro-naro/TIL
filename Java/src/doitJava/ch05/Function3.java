package doitJava.ch05;

public class Function3 {

	public static void main(String[] args) {
		calculator(10, 5);
		calculator(20, 0);

	}

	public static void calculator(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.println(a + " - " + b + " = " + (a-b));
		System.out.println(a + " * " + b + " = " + (a*b));
		if (b == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		else {
			System.out.println(a + " / " + b + " = " + (a/b));
		}
		System.out.println("프로그램을 종료합니다.");
		System.out.println();
	}
}
