def factorial(n):
    if n == 0:
        return 1
    else:
        return n*factorial(n-1)

print("{}! = {}".format(5,factorial(5)))

# 재귀함수 - 자기 자신을 호출하는 것