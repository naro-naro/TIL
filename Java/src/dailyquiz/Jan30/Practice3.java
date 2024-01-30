package dailyquiz.Jan30;

public class Practice3 {

	public static void main(String[] args) {
		// continue
		int[] score = {90, 25, 67, 45, 80};
		for (int i=0; i<score.length; i++) {
			if (score[i] < 50) continue;
			System.out.println((i+1)+"번 학생, 축하합니다. 합격입니다!");
		}
		
		System.out.println(); //---------------------------------
		
		int index = 0;
		for (int sc : score) {
			index++;
			if (sc < 50) continue;
			System.out.println((index) + "번 학생, 축하합니다. 합격입니다!");
		}
	}

}
