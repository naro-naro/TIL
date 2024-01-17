dict = {
    1:1,
    2:1
}
def fibo(n):
    if n in dict:
        return dict[n]
    result = fibo(n-2) + fibo(n-1)
    dict[n] = result
    return result

# 흐름 중간에 리턴 사용하기 = 조기 리턴
# 이렇게 하면 들여쓰기가 하나 줄어든다!

print(fibo(10))