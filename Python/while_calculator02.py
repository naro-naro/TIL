#무한 루프 합 계산기
sum, a, b = 0, 0, 0
while True:
    a = int(input("합할 첫 번째 수를 입력하세요. : "))
    b = int(input("합할 두 번쨰 수를 입력하세요. : "))
    sum = a+b
    print("%d + %d = %d"%(a, b, a+b))