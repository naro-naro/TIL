package dailyquiz.Feb06;

// 인덱스 범위를 초과하는 프로그램
public class ArrayExceptionSample {
	public static void main(String[] args) {
		int[] arr = {3, 4, 5, 6};
		System.out.println(arr[5]);
		// java.lang.ArrayIndexOutOfBoundsException
		// 인덱브 범위 초과 오류
	}

}
