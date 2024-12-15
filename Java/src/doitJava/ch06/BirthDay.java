package doitJava.ch06;

public class BirthDay {
	int day;
	int month;
	int year;
	
	// 연도를 지정하는 메소드
	public void setYear(int year) {
		this.year = year;
	}
	
	// this 출력 메소드
	public void printThis() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(1998);
		System.out.println(bDay);	// 참조 변수 출력
		bDay.printThis();			// this 출력 메소드 호출
		// 참조변수 출력 : 클래스이름@메모리주소
	}
}