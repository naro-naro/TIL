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
		
		for(int i = 0; i<lineCount; i++) { 		// 4줄 동안 반복
			for(int j = 0; j<spaceCount; j++) { // 공백 개수 만큼 반복
				System.out.print(' ');
			}
			for(int j = 0; j<starCount; j++) {
				System.out.print('*');
			}

			spaceCount-=1;
			starCount+=2;
			System.out.println();

        }
	}

}
