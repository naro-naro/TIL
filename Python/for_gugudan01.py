#for문으로 입력한 단 출력하기
num = int(input("단을 입력하세요 : "))
i = 0
for i in range(1,10):
    print("%d X %d = %d"%(num, i, i*num))