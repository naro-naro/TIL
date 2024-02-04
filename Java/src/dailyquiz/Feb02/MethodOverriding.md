# 메소드 오버라이딩

<p>부모 클래스의 상속이 적합하지 않아 자식 클래스에서 수정해서 사용</p>
<p>자식 클래스에서 동일한 메소드를 재정의</p>

### 메소드 오버라이딩 규칙
- 부모의 메소드와 동일한 시그니처(리턴타입, 메소드이름, 매개변수)를 가져야 한다.
- 부모 클래스의 메소드보다 접근 제한을 더 강하게 오버라이딩 할 수 없다.
- 새로운 예외를 throws 할 수 없다