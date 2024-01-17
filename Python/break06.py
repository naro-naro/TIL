#'$'를 입력하면 중지되는 프로그램
sum, a, b = 0, 0, 0
while True:
    a = input("합할 첫번째 숫자 : ")
    if a == "$":
        break
    b = int(input("합할 두번째 숫자 : "))
    sum = int(a) + b
    print( '%d + %d = %d'%(int(a), b, sum))
print("$를 입력해 프로그램을 종료합니다.")