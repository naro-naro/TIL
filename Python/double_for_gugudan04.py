#중첩 for문을 이용해서 구구단 전체를 거꾸로 가로 출력하기
i, k, guguline = 0, 0, ""
for i in range(2,10):
    guguline += ("  # %d단 #"%i)
print(guguline)
for i in range(9,0,-1):
    guguline = ""
    for k in range(2,10):
        guguline += ("%3dX%d= %2d"%(k, i, i*k))
    print(guguline)