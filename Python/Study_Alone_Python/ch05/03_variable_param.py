# 가변 매개변수 : 원하는 만큼 매개변수를 받는다!
# def 함수이름(매개변수,매개변수,...,가변매개변수):
#     문장
# 가변 매개변수 뒤에는 일반 매개변수가 올 수 없다
# 가변 매개변수는 하나만 사용할 수 있다

def print_n_times(n,*values):
    for i in range(n):
        for value in values:
            print(value)
        print()

print_n_times(3,"나는","호랑이소굴로","들어가")