# 람다식 #
***람다식*** : 함수(메소드)를 간단한 식으로 표현하는 방법 <br>
***람다식의 장점***
- 코드가 간결해짐
- 컬렉션 요소를 필터링 또는 매핑해서 원하는 결과를 쉽계 집계함
<br>

***형태*** : ```(매개변수) -> {실행코드}``` <br>
메소드의 이름과 반환타입을 제거하고 ```->```를 중괄호 블록 ```{}``` 앞에 추가한다 <br>

### before
```
int max(int v1, int v2) {
    return v1 > v2 ? v1 : v2;
}
```
⇩
### after1
```
(int v1, int v2) -> {
    return v1 > v2 ? v1 : v2;
}
```

혹은 리턴값이 있을 때는 ```return```문도 생략 가능함
### after2
```
(int v1, int v2) -> v1 > v2 ? v1 : v2;
```
<br><br>

## 다양한 형태의 람다식
```
(int a) -> {System.out.println(a);}
(a) -> {System.out.println(a);}; // 매개변수는 런타임 시 자동으로 인식되므로 타입 언급 안해도 됨
a -> System.out.println(a); // 매개변수, 실행문이 1개일 떄는 () {} 생략 가능

(x, y) -> {return x + y;}
(x, y) -> x + y; // {}안에 return문만 있을 때 return 생략 가능

(name, i) -> System.out.println(name+"="+i);

x -> x * x;
```