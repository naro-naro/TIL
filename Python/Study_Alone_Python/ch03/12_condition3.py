num = input("자연수를 입력하세요 : ")

char = num[-1]

num =int(num)
if num <=0:
    print("자연수를 입력하세요")
else:
    if char in "24680":
        print("짝수입니다.")
    elif char in "13579":
        print("홀수입니다.")