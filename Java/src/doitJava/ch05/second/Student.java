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
	
	// 학생이름을 반환하는 메서드
	public String getStudentName() {
		return studentName;
	}
	
	// 학생이름을 부여하는 메서드
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student(); // Student 클래스 생성
		studentAhn.studentName = "안유진";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
