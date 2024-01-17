dict = {
    1:1,
    2:1
}
def fibonacci(n):
    if n in dict:
        return dict[n]
    else:
        result = fibonacci(n-2)+fibonacci(n-1)
        dict[n] = result
        return result

print(fibonacci(10))
print(fibonacci(20))
print(fibonacci(30))
print(fibonacci(40))
print(fibonacci(50))

# 딕셔너리를 사용해서 한번 계산한 값을 저장하는것 = 메모한다
# 메모화를 사용하면 코드의 속도가 빨라진다!