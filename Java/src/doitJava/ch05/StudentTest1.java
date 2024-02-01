// Student2 클래스를 생성하는 실행 클래스
package doitJava.ch05;

public class StudentTest1 {
	public static void main(String[] args) {
		Student2 studentPark = new Student2(); // Student2 클래스 생성
		studentPark.studentName = "박시연";
		
		System.out.println(studentPark.studentName);
		System.out.println(studentPark.getStudentName());
	}
}
