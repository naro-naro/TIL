#for문을 이용하여 1부터 10까지의 합을 구하는 프로그램
i, sum = 0, 0
for i in range(1,11,1):
    sum = sum+i
    #sum에 해당하는 값이 정해지지 않아 오류 발생
print("1부터 10까지의 합은 %d입니다."%sum)