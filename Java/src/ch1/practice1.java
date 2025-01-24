package ch1;
 import java.util.Scanner;
 public class practice1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name;
		for(;;) {
        Scanner input = new Scanner(System.in);
		System.out.print("학생의 이름을 입력하세요:");
		
		name = input.nextLine();
		
		if(name == "나") {
		System.out.println(name+"는 공부가 하기 싫습니다.");}
		else if(name == "너" ) {
		System.out.println(name+"도 공부가 하기 싫구나!");}
		else {
			System.out.println(name+"님도 공부 힘내세요...");}
		}	
	}
}
