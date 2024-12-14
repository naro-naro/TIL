package doitJava.ch05.second;

public class PersonTest {

	public static void main(String[] args) {
		// Person() : 생성자 - 클래스를 처음 만날 떄 멤버 변수나 상수를 초기화
		Person personLee = new Person();

		Person personChoi = new Person();
		personChoi.name = "최지훈";
		
		Person personPark = new Person();
		personPark.name = "박시연";
		personPark.weight = 54.5f;
		personPark.height = 162.3f;
		
		Person personJang = new Person("장원영", 173, 45);
	}

}
