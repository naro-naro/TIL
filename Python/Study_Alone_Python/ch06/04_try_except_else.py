# try except else 구문으로
# 예외 처리하기!!!^-^*
try:
    num_input_a = int(input("정수를 입력하세요: "))
except:
    print("정수를 입력하지 않았습니다.")
else:
    print("반지름 :",num_input_a)
    print("둘레 :",3.14*2*num_input_a)
    print("넓이 :",3.14*num_input_a**2)