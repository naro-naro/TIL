package dailyquiz.Feb06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 존재하지 않는 파일을 열기 위한 자바 프로그램
public class ExceptionSample {

	/*
	 * -수정 전-
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("존재하지_않는_파일"));
		br.readLine();
		br.close();
	}
	 * java.io.FileNotFoundException : 원하는 파일을 찾을 수 없다는 오류
	 */
	
	
	// -수정 후-
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("존재하지_않는_파일"));
			br.readLine();
			br.close();
		} catch(IOException e) {
			System.out.println("error message : " + e.getMessage());
		}
	}
}