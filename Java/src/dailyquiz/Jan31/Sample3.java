package dailyquiz.Jan31;

class NewCalculator {
	int resultA = 0;
	int resultM = 1;
	
	int add(int num) {
		resultA += num;
		return resultA;
	}
	
	int multiple(int num) {
		resultM *= num;
		return resultM;
	}
}


public class Sample3 {

	public static void main(String[] args) {
		NewCalculator cal1 = new NewCalculator(); // 계산객체 1 생성
		NewCalculator cal2 = new NewCalculator(); // 계산객체 2 생성

		System.out.println(cal1.add(5));
		System.out.println(cal1.add(4));
		
		System.out.println(cal2.add(1));
		System.out.println(cal2.add(10));
	}

}
// 객체를 이용하면 계산기의 수가 늘어나도 객체만 생성하면 되고 클래스는 1개만으로 가능