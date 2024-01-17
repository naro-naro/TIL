# 이터러블 : 내부에 있는 요소들을 차례차례 꺼낼 수 있는 객체 (리스트, 딕셔너리, 문자열 튜플)
# 이터레이터 : 이터러블 중에서 next()함수로 하나하나 꺼낼수 있는 요소
# for 반복자 in 반복할수있는것

num = [1,2,3,4,5,6]
r_num = reversed(num)

print("r_num :",r_num)
for i in range(len(num)):
    print(next(r_num))
    i+= 1