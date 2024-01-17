#-1번째 자리는 맨 마지막 글자자리
#-2번째는 뒤에서 두번째 글자자리
#0번째는 맨 앞글자자리

number = input("정수를 입력하세요 : ")
last_character = number[-1]
last_number = int(last_character)
if last_number % 2 == 0:
    print("짝수입니다")
else:
    print("홀수입니다")