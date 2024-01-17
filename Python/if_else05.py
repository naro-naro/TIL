#3의 배수 판정 프로그램
num1 = input("세 자리 자연수를 입력하세요. : ")
num2 = int(num1[0] + num1[1] + num1[2])
if num2 % 3 == 0:
    print("{}은 3의 배수입니다".format(num2))
else:
    print("{}은 3의 배수가 아닙니다.".format(num2))