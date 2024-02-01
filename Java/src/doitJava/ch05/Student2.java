// Student2 클래스에 main()함수  포함시키기
package doitJava.ch05;

public class Student2 {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) { // main함수 : 프로그램의 시작 클래스
		Student2 studentPark = new Student2(); // Student2클래스 생성
		studentPark.studentName = "박시연";
		
		System.out.println(studentPark.studentName);
		System.out.println(studentPark.getStudentName());
	}
}
// 모든 클래스가 main()함수를 갖는 것은 아니다
// main()을 포함한 실행용 클래스를 따로 만들어 실행기도 한다