package doitJava.ch04;

public class For {

	public static void main(String[] args) {
		// for문의 요소는 상황에 따라 생략할 수 있다!
		
		int i = 0;
		int sum = 0;
		for ( ; i < 5; i++) {
			// 이미 앞에서 변수를 초기화했다면 초기화 부분을 생략할 수 있다
		}
		
		
		for (i = 1; ; i++){
			sum += i;
			if (sum > 200) break;
			// 다른 조건으로 끝점을 지정했기 때문에 i의 끝점을 지정하는 조건식도 생략 가능 
		}
		
		
		for (i = 0; i < 10; ) {
			i = (++i) % 10;
			// 다른 변수 값에 의해 좌우되기 떄문에 증감식 생략 가능
		}
		
	
		for ( ; ; ) {
			// 전부 다 생략하면 무한 반복
		}
		
		}

}
