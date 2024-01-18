package first_package;

public class For1 {

	public static void main(String[] args) {
		
		int i;
		String back = "back";
		
		// "Homerun" 출력을 5번 반복
		// 특정 횟수만 반복 처리를 할 때는 for문을 사용한다.
		// (어떤 상황 변화가 발생하기까지 반복 처리를 할 때는 while문 사용)

		// i=1 : i의 초기값을 1로 설정
		// i<=5 : i가 5보다 작거나 같은 동안 반복
		// i++ : i의 값을 1씩 증가시킨다
		for (i=1; i<=5; i++) {
			System.out.println("Homerun!");
		}
		
		// "back to back to ..."를 홈런 개수만큼 반복
		for (i=1; i<=4; i++) {
			back = back + " to back";
		}
		System.out.println();
		System.out.println(back+"!");
	}

}
