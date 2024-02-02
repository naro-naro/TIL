package dailyquiz.Jan31;

public class Divide {

	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	double divide(int x, int y) {
		if (y == 0) {
			System.out.println("0으로는 나눌 수 없습니다!!!");
			return 0;
		}
		else {
			return x/y;			
		}
	}
}
