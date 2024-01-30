package doitJava.ch04;

public class SwitchCase1 {

	public static void main(String[] args) {
		// switch - case문 예제
		// 순위에 따라 선수에게 수여하는 메달 색을 정해주는 프로그램
		int rank = 1;
		char medalColor;
		
		switch(rank) {
			case 1 : medalColor = 'G';
			break;
			
			case 2 : medalColor = 'S';
			break;
			
			case 3 : medalColor = 'B';
			break;
			
			default:
				medalColor = 'A';
		}
		System.out.println(rank + "등의 메달 색깔 : " + medalColor);
	}

}
