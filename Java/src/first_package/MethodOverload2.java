package first_package;

public class MethodOverload2 {

	public static void main(String[] args) {
		// Java는 다중정의된 메소드를 정확히 선택하기 위해서 인수 구성을 체크한다
		
		/* 1 
		 * int myfunc();
		 * int myfunc(int a);
		 * int myfunc(int a, int b):
		 * : 개수가 다르므로 식별 O
		 * 
		 * 2
		 * int myfunc(int a);
		 * int myfunc(double a);
		 * : 데이터형이 다르므로 식별 O
		 * 
		 * 3
		 * int myfunc(int a, double b);
		 * int myfunc(double a, int b);
		 * : 데이터형의 순서가 다르므로 식별 O
		 * 
		 * 4
		 * int myfunc(int a);
		 * int myfunc(int b);
		 * : 가인수명의 차이로는 식별 X (error)
		 * 
		 * 5
		 * int myfunc(int a);
		 * double myfunc(int a);
		 * : 리턴값의 차이로는 식별 X (error)
		 * */

	}

}
