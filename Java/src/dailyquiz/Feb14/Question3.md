### 3. `TwoContainerExample` 클래스의 main() 메소드는 `TwoContainer` 제네릭 타입을 사용하고 있습니다. main() 메소드에서 사용하는 방법을 참고해서 `TwoContainer` 제네릭 타입을 선언해보세요.

```java
public class TwoContainerExample {

	public static void main(String[] args) {
		TwoContainer<String, String> container = new TwoContainer<>();
		container.set("홍길동", "도적");
		String name = container.getKey();
		String job = container.getValue();

		TwoContainer<String, Integer> secondContainer = new TwoContainer<>();
		secondContainer.set("홍길동", 35);
		String name2 = secondContainer.getKey();
		Integer age = secondContainer.getValue();
	}
}
```