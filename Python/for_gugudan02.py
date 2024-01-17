#for문을 이용하여 입력한 단을 거꾸로 출력하기
i=0
dan = int(input("단을 입력하세요. : "))
for i in range(9,0,-1):
    print("%d X %d = %d"%(dan, i, dan*i))