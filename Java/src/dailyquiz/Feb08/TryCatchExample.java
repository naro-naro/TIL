package dailyquiz.Feb08;

// Java6 이전까지 사용했던
// 리소스 객체를 안전하게 닫기 위한 코드

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchExample {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("file.txt"));
			br.readLine();
			br.close();
		} catch (FileNotFoundException e) {
			// FileNotFoundException 발생 예외 처리
		} catch (IOException e) {
			// IOException 발생 예외 처리
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// 예외 처리
				}
			}
		}

	}

}
