package first_package;

public class Method1 {

	public static void main(String[] args) {
		// 메소드란? 데이터의 처리나 특정 행위같은 어떤 특정한 기능을 구현한 것
		// 메소드의 구조
		// 1 인수 : 어떤 데이터를 전달하면
		// 2 본체 : 정해진 처리를 해서
		// 3 리턴 : 결과값을 리턴
		// 용도에 따라서 1 또는 3은 생략 가능
		
		//거듭제곱 계산하기
		int nn;
		int d1=3; int d2=4;
		
		nn = beki(2,4);	// 2의 4제곱을 계산하여
		System.out.println(nn);	// 출력
		nn = beki(d1, d2);	// d1의 d2제곱을 계산하여
		System.out.println(nn);	// 출력
	}
	
	public static int beki (int a, int b) {	// beki메소드 정의
		int i, wk =1;	// 메소드 안에서 일시적으로 사용하는 변수
		
		for (i=1; i<=b; i++) {	// 1에다 b번 곱한다
			wk = wk*a;	// 1에다 a를 곱한다 b번
		}
		return wk;	// 결과값 리턴
	}

}
