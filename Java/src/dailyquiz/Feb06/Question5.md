### 5. 다음과 같은 메소드가 있을 때 예외를 잘못 처리한 것은 무엇입니까?

```java
public void method1() throws NumberFormatException, ClassNotFoundException { ... }
```

1) try { method1(); } catch(Exception e) { }

2) void method2() throws Exception { method1() };

3) try { method1(); } catch(Exception e) { } catch(ClassNotFoundException e) { }

4) try { method1(); } catch(ClassNotFoundException e) { } catch(NumberFormatException e) { }

- 답 : 3
- 해설 : 상위 예외 클래스는 하위 예외 클래스보다 나중에 처리해야 함. 안그럼 컴파일에러 발생. 