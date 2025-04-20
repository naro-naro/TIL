package doitJava005.constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {
		// 디폴트 생성자
	}
	
	public Person(String pname) {
		name = pname;
		// 이름을 인수로 받는 생성자
	}
}
