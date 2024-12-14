package doitJava.ch05.hiding;

public class Student {
	int studentID;
	private String studentName; // private 접근 제어자 : 외부클래스에서 사용 불가
	int grade;
	String address;
//	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
