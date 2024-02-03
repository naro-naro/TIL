package doitJava.ch05;

public class StudentTest3 {
	public static void main(String[] args) {
		Student2 student1 = new Student2();
		student1.studentName = "손흥민";
		
		Student2 student2 = new Student2();
		student2.studentName = "이강인";
		
		System.out.println(student1);
		// 참조변수 값이 출력된다
		// 클래스이름@주소값(==해시값)
		// 생성된 객체에 할당되는 가상 주소값
		System.out.println(student2.studentName);
	}
}
