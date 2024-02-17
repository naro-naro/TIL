package dailyquiz.Feb08;

// Java7에서 추가된 try-with-resource를 사용해
// 리소스 close

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {
	
	public static void main(String[] args) {
		BufferedReader br = null;
		
		// try-with-resource를 사용하면 명시적으로 close()를 호출하지 않아도 된다
		// try블록이 정상적으로 실행을 완료했거나 중간에 예외가 발생하면
		// 자동으로 BufferedReader의 close()메소드가 호출된다
		
		try (BufferedReader reader = new BufferedReader(new FileReader("filename.txt"));
			// 여러개의 리소스를 사용할 때
			// BufferedReader writer = new BufferedWriter(new FileWriter("filename2.txt"));
				){
			br = new BufferedReader(new FileReader("filename.txt"));
			br.readLine();
			br.close();
		} catch (IOException e) {
			// 예외 처리;
		}
	}

}
