### 2. `ContainerExample` 클래스의 main() 메소드는 `Container` 제네릭 타입을 사용하고 있습니다. main() 메소드에서 사용하는 방법을 참고해서 `Container` 제네릭 타입을 선언해보세요.

```java
public class ContainerExample {

	public static void main(String[] args) {
		Container<String> stringContainer = new Container<>();
		stringContainer.set("홍길동");
		String str = stringContainer.get();

		Container<Integer> intContainer = new Container<>();
		intContainer.set(6);
		int value = intContainer.get();
	}
}
```