#누적 합계가 1000 이상이 되는 시작 지점 찾기
sum, i = 0, 0
for i in range(1,101):
    sum += i
    if sum >= 1000:
        break
print("1더했을 때 그 합이 처음으로 1000 이상이 되게 하는 수는 %d입니다."%i)