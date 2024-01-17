# 숫자를 입력받기
user_input_a = input("정수를 입력하세요 :")

# 사용자 입력이 숫자로만 구성되어 있을 때
if user_input_a.isdigit():
    # 숫자로 변환하기
    num_input_a = int(user_input_a)
    # 출력
    print("원의 반지름 : {}".format(num_input_a))
    print("원의 둘레 : {}".format(num_input_a*2*3.14))
    print("원의 넓이 : {}".format((num_input_a**2)*3.14))
else:
    print("정수를 입력하라고 했자나여ㅡㅡ^")