package doitJava.ch05.second;

public class StudentTest2 {

	// 참조 값 출력하기
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "안유진";

		Student student2 = new Student();
		student2.studentName= "장원영";
		
		// 참조 변수 값 출력
		System.out.println(student1);
		System.out.println(student2);
	}

}
