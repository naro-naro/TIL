# 제네릭(generic) #
***제네릭*** : 데이터 타입을 일반화 하는 것 <br>
클래스나 메소드에 사용할 내부 데이터 타입을 컴파일 시 미리 정하는 방법 <br>
Java5부터 새로이 추가되었다

**컴파일 시 타입 검사를 할 때의 장점**
- 타입 검사나 변환 등 번거로운 작업을 생략할 수 있다
- 클래스, 메소드 내부에서 사용하는 타입 안정성을 높일 수 있다

## 제네릭을 사용하는 이유 ##
해당 타입을 이용하면 잘못된 타입이 사용될 수 있는 문제를 <br>
컴파일 과정에서 미리 제거할 수 있다

```
List<Youtube> youtubeList = new ArrayList<Youtube>();

youtubeList.add(new Youtube());
youtubeList.add(new DisneyPlus()); // 컴파일 에러 발생 : Youtube 외 다른 타입 저장 불가
```

<br>제네릭은 클래스, 인터페이스, 메소드를 정의할 때 ***타입을 파라미터로*** 사용 할 수 있게 한다
<br>

## 제네릭 사용의 장점 ##
- **컴파일 시** 강한 타입 체크 : 에러 사전 방지
- 타입 변환(casting) 제거 : 타입이 정해지므로 변환이 불필요 → 성능 업
```
List list = new ArrayList();
list.add("Hello");
String str = (String)list.get(0);
```
⇩
```
List<String> list = new ArrayList<String>();
list.add("Hello");
String str = list.get(0);
```
<br><br>

# 제네릭 타입 #
**제네릭 타입** : 타입을 파라미터로 가지는 클래스와 인터페이스 <br>
클래스 또는 인터페이스 뒤에 ```<T(타입 파라미터)>```가 붙음 <br>
타입 파라미터는 일반적으로 알파벤 한 글자 T(**T**ype) <br>
T는 객체 생성 시 지정한 타입으로 자동 변환된다.
```
public class 클래스명<T> {
    ...
}

public interface 인터페이스명<T> {
    ...
}
```
<br><br>

 * Object 클래스는 모든 Java 클래스의 최상위 부모 클래스
 * 모든 Java 객체는 Object 타입으로 자동 변환되어 저장된다
```
Object object = 자바의_모든_객체;
```
