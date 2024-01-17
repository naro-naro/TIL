num = input("자연수를 입력하세요 : ")

char = num[-1]

char = int (char)

num =int(num)
if num <=0:
    print("자연수를 입력하세요")
else:
    if char%2 ==0:
        print("짝수입니다.")
    else:
        print("홀수입니다.")