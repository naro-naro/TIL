# 어노테이션
== 메타데이터 <br>
: 애플리케이션이 처리할 데이터가 아니라, <br>
컴파일 과정과 실행 과정에서 코드를 어떻게 컴파일하고 처리할 것인지 알려주는 정보 <br>

### 용도
- 컴파일러에게 코드문법에러를 체크하도록 정보 제공
- SW 개발 툴이 빌드나 배치시 코드를 자동으로 생성할 수 있도록 정보 제공
- 실행(런타임) 시 특정 기능을 실행하도록 정보 제공

### 문법
``` @어노테이션 ```
```
public @interface Annotation {
    타입 elementName() [default 값];
}
```
어노테이션은 엘리먼트를 멤버로 갖는다 <br>
엘리먼트는 타입과 이름으로 구성되며, 디폴트값을 가질 수 있다 <br>
엘리먼트 뒤에는 ()를 붙여야 한다 <br>