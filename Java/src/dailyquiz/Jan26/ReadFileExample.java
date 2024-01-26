package dailyquiz.Jan26;

import java.io.FileInputStream;
import java.io.IOException;


public class ReadFileExample {

	public static void main(String[] args) {
		
		// try-with-resources 구문을 사용하여 FileInputStream을 정의하고 초기화
        // 이 구문을 사용하면 try 블록이 끝날 때 자동으로 FileInputStream을 닫아줍니다.
		try (FileInputStream fis = new FileInputStream("example.txt")) {
			
			// 10바이트 크기의 바이트 배열 생성
			byte[] bytes = new byte[10];
			
			// FileInputStream으로부터 읽은 바이트 수를 저장하는 변수
			int readCount = fis.read(bytes);
			
			// 읽은 바이트 수만큼 반복하여 배열의 내용을 출력
			for (int i=0; i<readCount; i++) {
				// 바이트를 문자로 변환하여 출력
				System.out.println((char)bytes[i]);
			}
		} catch (IOException e) {
			// IOException이 발생하면 예외를 처리하고 예외 정보를 출력
			e.printStackTrace();
		}

	}

}
/*
 * byte : 파일 데이터 읽기
 * 파일에서 데이터를 읽을 때, 데이터는 바이트 단위로 처리된다.
 * 파일에서 데이터를 읽는 간단한 예제
 */