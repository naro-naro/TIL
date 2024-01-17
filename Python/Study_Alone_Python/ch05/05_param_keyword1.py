def print_n_times(*values,n=2):
    for i in range(n):
        for value in values:
            print(value)
        print()

print_n_times("종소리","울려라","종소리울려",3)
# 3이 가변매개변수로 인식되어 3까지 네줄이 두번 반복됨

print_n_times("흰눈사이로","썰매를타고","달리는기분",n=3)
# 키워드 매개변수를 사용해 3을 기본매개변수로 인식해
# 달리는기분까지 세줄이 3번 반복됨