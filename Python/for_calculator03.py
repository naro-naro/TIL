#for문으로 1부터 사용자가 입력한 값 사이의 합 구하기
i, sum = 0, 0
num = int(input("값을 입력하세요 : "))
for i in range(1,num+1,1):
    sum += i
print("1부터 %d까지의 합은 %d입니다."%(num, sum))