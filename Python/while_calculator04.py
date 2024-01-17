#while문으로 입력한 첫값과 끝값 사이의 증가량에 따른 값들의 합 구하기
num1 = int(input("시작값을 입력하세요. : "))
num2 = int(input("끝값을 입력하세요. : "))
num3 = int(input("증가량을 입력하세요. : "))
sum = 0
i = num1
while i<num2+1:
    sum += i
    i += 1
print("%d에서 %d사이 %d씩 증가시킨 값들의 합은 %d입니다."%(num1, num2, num3, sum))