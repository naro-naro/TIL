package first_package;

public class If6 {

	public static void main(String[] args) {
		int year;
		
		year = 2024;
		System.out.print(year + "년은");

		if(year%4==0 && year%100!=0) {
			System.out.println(" 윤년입니다.");
		}
		else if(year%400==0) {
			System.out.println(" 윤년입니다.");
		}
		else {
			System.out.println(" 윤년이 아닙니다.");
		}
	}

}
