package doitJava.ch05.second;

public class StudentTest1 {

	public static void main(String[] args) {
		Student student1 = new Student(); // 첫 번째 학생 생성
		student1.studentName = "안유진";
		System.out.println(student1.getStudentName());
		
		Student student2 = new Student(); // 두 번쨰 학생 생성
		student2.studentName = "장원영";
		System.out.println(student2.getStudentName());
	}

}
