package doitJava.ch03;

public class Operation02 {

	public static void main(String[] args) {
		// 단락 회로 평가 : Short Circuit Evaluation (SCE)
		int num = 5;
		int i = 10;
		
		boolean value = ((num *=10) >45) || ((i-=5)<10);
		// 하나라도 참이면 되는데 앞이 참이므로 뒤 연산은 실행되지 않음
		// num = 50, i = 10(그대로)
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);

	}

}
