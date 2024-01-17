# 문자열.join(문자열로 구성된 리스트)
print("::".join(["안","녕","하","세","요"]))
print()

num = int(input("정수 입력> "))
if num%2 == 0:
    print("\n".join(["입력한 수는 {}입니다.","{}는(은) 짝수입니다."]).format(num,num))
else:
    print("\n".join(["입력한 수는 {}입니다.","{}는(은) 홀수입니다."]).format(num,num))
