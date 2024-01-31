package doitJava.ch05;

public class Function2 {

	public static void main(String[] args) {
		divide(33, 3);
		divide(33, 0);

	}

	public static void divide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return;
		}
		else {
			int result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
		}
	}
}
