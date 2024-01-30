package doitJava.ch04;

import java.util.Scanner;
public class SwitchCase2 {

	public static void main(String[] args) {
		// switch문으로 달력 출력
		int day;
		Scanner input = new Scanner(System.in);
		day = input.nextInt();
		
		switch(day) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			System.out.println("*** " + day + "월 달력 ***");
			for(int i = 1; i <=31; i++) {
				System.out.println(i + "일");
			}
			break; // break문을 쓰지 않으면, 아래 케이스 전부 실행됨
		
		case 4 : case 6 : case 9 : case 11 :
			System.out.println("*** " + day + "월 달력 ***");
			for(int i = 1; i <=30; i++) {
				System.out.println(i + "일");
			}
			break;
			
		case 2 :
			System.out.println("*** " + day + "월 달력 ***");
			for(int i = 1; i <=28; i++) {
				System.out.println(i + "일");
			}
			break;
		}
	}

}
