package doitJava.ch05.second;

public class Person {
	String name;
	float height;
	float weight;
	char gender;
	boolean married;
	
	// 디폴트 생성자
	public Person() {}
	
	// 사람이름을 매개변수로 입력받는 생성자
	public Person(String pname) {
		name = pname;
	}
	
	// 사람이름, 키, 몸무게를 매개변수로 입력받는 생성자
		public Person(String pname, float pheight, float pweight) {
			name = pname;
			height = pheight;
			weight = pweight;
		}
}
