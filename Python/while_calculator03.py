#무한루프 계산기
a, b, ch = 0, 0, ""
while True:
    a = int(input("계산할 첫 번째 숫자를 입력하세요. : "))
    b = int(input("계산할 두 번째 숫자를 입력하세요. : "))
    ch = input("계산할 연산자를 입력하세요. : ")

    if ch == "+":
        print("%d + %d = %d"%(a, b, a+b))
    elif ch == "-":
        print("%d - %d = %d"%(a, b, a-b))
    elif ch == "*":
        print("%d * %d = %d"%(a, b, a*b))
    elif ch == "/":
        print("%d / %d = %d"%(a, b, a/b))
    elif ch == "**":
        print("%d ** %d = %d"%(a, b, a**b))
    elif ch == "%":
        print("%d %% %d = %d"%(a, b, a%b))
    elif ch == "//":
        print("%d // %d = %d"%(a, b, a//b))
    else:
        print("잘못된 연산자입니다.")