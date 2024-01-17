nums = list(range(1,10+1))

print("홀수만 추출하기")
print(list(filter(lambda x: x%2==1 ,nums)))
print()

print("3 이상 7 미만 추출하기")
print(list(filter(lambda x: 3<=x<7, nums)))
print()

print("제곱해서 50미만인 수 추출하기")
print(list(filter(lambda x: 50>(x**2),nums)))