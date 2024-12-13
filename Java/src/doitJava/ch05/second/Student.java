package doitJava.ch05.second;

// class : 클래스를 만드는 예약어
// Student : 클래스 이름
public class Student {
	// 멤버변수 생성
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 메서드 생성
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
}
