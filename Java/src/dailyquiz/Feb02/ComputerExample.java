package dailyquiz.Feb02;

// 메소드 오버라이딩 테스트
public class ComputerExample {

	public static void main(String[] args) {
		
		Calculator cal10 = new Calculator();
		System.out.println("원의 면적 : " + cal10.areaCircle(10));
		System.out.println();
	
		Computer com10 = new Computer();
		System.out.println("원의 면적 : " + com10.areaCircle(10));
	}

}
