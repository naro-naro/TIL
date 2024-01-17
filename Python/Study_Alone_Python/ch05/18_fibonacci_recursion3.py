# counter = 0
# def fibonacci(n):
#     counter += 1
#     if n ==1:
#         return 1
#     elif n ==2:
#         return 2
#     else:
#         return fibonacci(n-2) + fibonacci(n-1)
    
# print(fibonacci(10))

# 오류가 발생한다...!

# 파이썬은 외부 변수를 참조할 수 없다
# global 키워드를 사용해 함수 외부의 변수에 접근할 수 있다