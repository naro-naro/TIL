# try except 구문으로 예외 처리
try:
    num_input_a = int(input("정수를 입력하세요> "))
    print("반지름 :",num_input_a)
    print("둘레 :",num_input_a*2*3.14)
    print("넓이 :",3.14*num_input_a**2)
except:
    print("오류 발생!")