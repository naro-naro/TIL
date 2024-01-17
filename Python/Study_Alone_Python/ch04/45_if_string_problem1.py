num = int(input("정수를 입력하세요> "))
if num %2 == 0:
    print("""\
        입력한 정수는 {}이고,
        {}은(는) 짝수입니다.""".format(num,num))
else:
    print("""\
        입력한 정수는 {}이고,
        {}은(는) 홀수입니다.""".format(num,num))