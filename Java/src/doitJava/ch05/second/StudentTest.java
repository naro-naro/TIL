package doitJava.ch05.second;

// StudentTest 실행 클래스
// Student와 같은 패키지 안에 있기 때문에 실행 가능
// 다른 패키지라면 import를 통해 클래스를 불러와야 한다.
// 클래스 이름이 같아도 패키지가 다르면 다른 클래스이다.
public class StudentTest {

	public static void main(String[] args) {
		Student studentAhn = new Student(); // new 예약어로 Student 클래스 생성
		studentAhn.studentName = "안유진";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}