package doitJava.ch04;

import java.util.Scanner;
public class PrintStars1 {

	public static void main(String[] args) {
		/*
		    *   
		   ***  
		  *****
		 *******
		 */

		int lineCount;
        Scanner input = new Scanner(System.in); 
        lineCount = input.nextInt();
		int spaceCount = lineCount - 1;
		int starCount = 1;
		
		for(int i = 0; i<lineCount; i++) { 		// n줄 동안 반복
			for(int j = 0; j<spaceCount; j++) { // 공백 찍기
				System.out.print(' ');
			}
			for(int j = 0; j<starCount; j++) {  // 별 찍기
				System.out.print('*');			// 줄바꿈 안하고 이어붙여 찍기
			}

			spaceCount-=1;  		// 공백 개수 줄이기
			starCount+=2;			// 별 개수 늘리기
			System.out.println();

        }
	}

}
