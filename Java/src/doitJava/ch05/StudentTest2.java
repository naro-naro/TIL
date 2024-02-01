package doitJava.ch05;

public class StudentTest2 {

	public static void main(String[] args) {
		Student2 student1 = new Student2(); // 첫번째 학생 생성
		student1.studentName = "박시연";
		System.out.println(student1.getStudentName());
		
		Student2 student2 = new Student2(); // 두번째 학생 생성
		student2.studentName = "박주혁";
		System.out.println(student2.getStudentName());
	}

}
