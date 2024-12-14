package doitJava.ch05.second;

public class Function {
	
	// int : 함수 반환형
	// add : 함수 이름
	// num1, num2 : 매개변수
	int add (int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	// 매개변수가 없는 함수
	int getTenTotal() {
		int i;
		int total = 0;
		for(i = 1; i <= 10; i++) {
			total += i;
		}
		return total;
	}

	// void : 반환값이 없음
	void printGreeting(String name) {
		System.out.println(name + "님 안녕하세요!");
		return;
	}
	
	// return : 함수 수행 종료
	void divide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
			return;
		}
		else {
			int result = num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" + result);
		}
	}
	
	public static void main(String[] args) {

	}

}
