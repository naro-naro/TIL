# 예외 #
**error** : 오류 발생<br>
**예외 처리** : 에러상황을 처리하여 프로그램의 정상 실행상태가 유지되도록 하는 것<br>
<br>
자바는 예외가 발생하면 **프로그램을 중단하고 오류 메세지**를 보여준다<br>
이 때, 예외처리를 해주면 ```중단하지 않고 오류메세지만 출력 후 다음 프로세스로``` 넘어간다 
<br><br>

# 예외 클래스의 계층 구조 #
예외 클래스의 종류
- 일반 예외 (Exception)
- 실행 예외 (Runtime Exception)
<br>

**두 종류 모두 예외 처리를 해야 함**
<br>

### 일반 예외 ###
== 컴파일러 체크 예외 <br>
컴파일 하는 과정에서 예외 처리 코드가 필요한지 검사함 <br>
예외 처리 코드가 없다면 컴파일 오류 발생<br>
### 실행 예외 ### 
컴파일 과정에서 예외 처리 코드를 검사하지 않는 예외<br>
<img src='Exception.png'>
<img src='RuntimeException.png'>
<br><br>

- Object : 예외의 최상위 부모
- Throwable : 최상위 예외
- Exception : 컴파일러가 체크하는 일반 예외
- RuntimeException : 컴파일러가 체크하지 않는 실행 예외
- Error : 메모리 부족이나 심각한 시스템 오류같은 복구 불가능한 예외, 개발자가 잡을 수 없는 예외
<img src='Untitled.png'>
<br><br>

# try-catch #
**기본 구조1**
```
try {
    수행할 문장1;
    수행할 문장2;
} 

catch(예외1) {
    수행할 문장A;
    수행할 문장B;
} 

catch(예외2) {
    수행할 문장a;
    수행할 문장b;
}
```
<br>

**기본 구조2**
<p>예외1, 2 중 하나라도 해당되면 A문장 실행</p>

```
try {
    수행할 문장1;
    수행할 문장2;
}

catch (예외1 | 예외2) {
    수행할 문장A;
}
```
<br><br>

# 다중 catch문 #
**상위 예외클래스가 하위 예외클래스보다 아래에 위치해야 한다!**
```
try {
    (ArrayIndexOutOfBoundsException 발생)

    (NumberFormatException 발생)
}

catch(ArrayIndexOutOfBoundsException e) { // 일단 범위 초과 예외를 처리한 후
    예외처리문1;
}

catch(Exception e) { // 나머지 예외들(더 범위가 큼) 처리
    예외처리문2;
}
```
<br><br>

# finally #
**finally**
: 어떤 예외가 발생하더라도(발생하지 않아도) 반드시 실행되게 함