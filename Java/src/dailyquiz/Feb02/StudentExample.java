package dailyquiz.Feb02;

public class StudentExample {

	public static void main(String[] args) {
		Student studentHong = new Student("홍길동", "1234-5678", 1);
		
		System.out.println("name : " + studentHong.name);
		System.out.println("ssn : " + studentHong.ssn);
		// 부모에게서 물려받은 필드 출력
		
		System.out.println("student number : " + studentHong.studentNo);

	}

}
