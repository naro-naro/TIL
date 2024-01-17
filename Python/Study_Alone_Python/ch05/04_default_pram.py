# 기본 매개변수 : 매개변수를 입력하지 않았을 때 들어가는 기본값
# 기본 매개변수 뒤에는 일반 매개변수가 올 수 없다
def print_n_times(value,n=2):
    for i in range(n):
        print(value)

print_n_times("나는 호랑이소굴로 들어가")

print_n_times("나는 호랑이소굴로",3)