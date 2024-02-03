# Getter
외부에서 객체의 데이터를 읽을 때고 메소드를 쓰자! <br>
클래스를 선언할 때 필드를 private로 선언해서 외부 접근을 보호하고,<br>
필드에 Setter Getter 메소드를 작성해 필드값을 안전하게 사용하는 것이 좋다 <br>
필드타입이 boolean일 때는 ```get필드```가 아니라 ```is필드```
```
// Getter
public 리턴타입 getFieldName() {
    return fieldName;
}
```

# Setter
메소드를 통해 데이터를 변경 <br>
데이터는 외부에서 접근할 수 없도록 막고 <br>
메소드는 공개해서 외부에서 메소드를 통해 데이터에 접근하도록 유도한다
```
// Setter
public void setFieldName(타입 fieldName) {
    this.fieldName = fieldName;
}
```