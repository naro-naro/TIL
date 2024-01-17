#for문을 이용하여 사용자가 입력한 두 값과 증가율을 이용해 그 합 구하기
i, sum = 0, 0
num1 = int(input("시작값을 입력하세요 : "))
num2 = int(input("끝값을 입력하세요 : "))
num3 = int(input("증가율을 입력하세요 : "))
for i in range(num1, num2+1, num3):
    sum += i
print("%d에서 %d까지 %d씩 증가시킨 값의 합은 %d입니다."%(num1, num2, num3, sum))