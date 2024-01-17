#중첩 for문을 이용해서 단의 이름과 구구단 전체를 출력하기
i, k = 0, 0
for i in range(2,10):
    print("***%d단***"%i)
    for k in range(1,10):
        print("%d X %d = %d"%(i, k, i*k))
    print()