package dailyquiz.Feb02;

public class Student extends Person {
	int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		// 부모클래스의 생성자 호출
		
		this.studentNo = studentNo;
	}

}
