# continue는 현재 반복을 생략하고 다음 반복으로 넘어갈 떄 사용

nums = [5,15,6,20,7,25]
for num in nums:
    if num<10:
        continue
        # num이 10보다 작으면 아래 구문을 실행하지 않고 다음 반복으로 넘김
    print(num)