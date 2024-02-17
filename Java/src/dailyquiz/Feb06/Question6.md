### 6. 다음 코드가 실행되었을 때 출력 결과는 무엇입니까?

```java
public class TryCatchFinallyExample {

	public static void main(String[] args) {
		String strArray[] = {"10", "23b"};
		int value = 0;
		for (int i = 0; i < 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과하였음");
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			} finally {
				System.out.println(value);
			}
		}
	}

}
```

- 답 : 
  - 10
  - 숫자로 변환할 수 없음
  - 10
- 해설 : 
  - i = 0 일 때 value = 10이 할당되어 10이 출력됨
  - i = 1 일 때 NumberFormatException이 발생하여 "숫자로 변환할 수 없음"이 출력됨
  - 예외의 발생 여부와 상관 없이 finally 구문은 실행되므로 위에서 할당된 value = 10이 한 번 더 출력됨