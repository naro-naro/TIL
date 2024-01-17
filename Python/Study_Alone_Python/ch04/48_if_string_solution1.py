# 괄호 내부에 문자열을 여러개 입력하면 모든 문자열을 합친 새로운 문자열이 만들어진다

test = (
    "이렇게 입력해도 "
    "하나의 문자열로 연결되어 "
    "생성됩니다"
)
print(test)
print(type(test))
print()

test_a = (
    "이렇게 여러개의 문자열이 든 괄호안을 ",
    "콤마로 엮으면? "
)
print(test_a)
print(type(test_a))
print()

num = input("정수를 입력하세요> ")
if int(num)%2 == 0:
    print(("입력한 문자열은 {}입니다.\n"
    "{}은(는) 짝수입니다.").format(num,num))
else:
    print(("입력한 문자열은 {}입니다.\n"
    "{}은(는) 홀수입니다.").format(num,num))