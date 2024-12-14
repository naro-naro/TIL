package doitJava.ch05.hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		// studentLee.studentName = "이상원";
		// ㄴ오류 발생 : private 변수에 접근할 수 없으므로 
		
		// set 메소드를 이용해 private 변수에 접근 가능
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}

}
