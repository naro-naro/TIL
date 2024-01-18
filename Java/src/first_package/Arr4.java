package first_package;

public class Arr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열 선언
		String baseball[] = new String[10];
		baseball[0] = "p";
		baseball[1] = "c";
		baseball[2] = "1b";
		baseball[3] = "2b";
		baseball[4] = "3b";
		baseball[5] = "ss";
		baseball[6] = "lf";
		baseball[7] = "cf";
		baseball[8] = "rf";
		baseball[9] = "dh";
		// baseball[10] = "coach";	-> error : ArrayIndexOutOfBoundsException
		// System.out.println(baseball.length);	-> 10
		
		String player[] = new String[10];
		player[0] = "KH Kim";
		player[1] = "MS Kim";
		player[2] = "JS Kang";
		player[3] = "SH Kim";
		player[4] = "J Choi";
		player[5] = "SH Park";
		player[6] = "G Heredia";
		player[7] = "JH Choi";
		player[8] = "JH Ha";
		player[9] = "YS Han";
		
		int i;
		for(i=0; i<10; i++) {
			System.out.println("position : " + baseball[i] + " , name : " + player[i]);
		}
	}

}
