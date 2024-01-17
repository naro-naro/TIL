# 함수의 매개변수로 함수 전달하기

def call_10_times(func):
    for i in range(10):
        func()
        # 열번동안 전달받은 함수를 10번 반복하는 함수

def print_bonjour():
    print("Bonjour!")

call_10_times(print_bonjour)

# call_10_times(print_bonjour()) 라고 안쪽함수뒤에 빈 괄호를 붙이면 쓰면 오류나는군!