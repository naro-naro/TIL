package doitJava.ch05;

// Student 클래스 만들기
public class Student1 {	// class : 클래스를 만드는 예약어
						// 클래스 이름 : Student (클래스 이름은 대문자로 시작)
	int studentID;		// 멤버 변수 선언
	String studentName;
	int grade;
	String address;

	
	public void showStudentInfo() { // 메소드 추가
		System.out.println(studentName + ", " + address); // 이름, 주소 출력
	}
	
	
	public String getStudentName() { // 학생의 이름을 반환하는 메소드
		return studentName;
	}
	
	
	public void setStudentName(String name) { // 학생 이름을 매개변수로 전달
		studentName = name;
	}
}
