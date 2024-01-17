#1~100의 합을 구하되, 3의 배수는 제외하고 더하기
sum, i = 0, 0
for i in range(1,101):
    if i%3==0:
        continue
    else:
        sum +=i
print("3의 배수를 제외한 1부터 100까지의 합은 %d입니다."%sum)