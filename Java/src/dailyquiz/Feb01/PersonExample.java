package dailyquiz.Feb01;

public class PersonExample {
	public static void main(String[] args) {
		Person person = new Person("광개토대왕");
		
		System.out.println(person.name);
		System.out.println(person.nation);
		
		// person.nation = "고구려";
		// 컴파일 오류 발생
		// final 상수는 값 수정이 불가하다
	}
}
