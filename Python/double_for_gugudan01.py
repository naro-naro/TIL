#중첩 for문을 활용하여 구구단 전체 출력
i, k = 0, 0
for i in range(2,10):
    for k in range(1,10):
        print("%d X %d = %d"%(i, k, k*i))
    print()