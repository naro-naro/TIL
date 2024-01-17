#첫 번쨰 수에 0이 입력 되면 프로그램 종료
a, b = 0, 0
while True:
    a = int(input("합할 첫 번째 수를 입력하세요. : "))
    if a == 0:
        break
    b = int(input("합할 두 번째 수를 입력하세요. : "))
    sum = a+b
    print("%d + %d = %d"%(a, b, sum))
print("0을 입력해 프로그램이 종료되었습니다.")