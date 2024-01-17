#for문으로 0과 100사이의 7의 배수의 합 구하기
i, sum = 0, 0
for i in range(7,100,7):
    sum += i
print("0부터 100 사이의 7의 배수의 합은 %d입니다."%sum)