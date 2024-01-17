# 해당하는 요소 제거하기
list_a = [1,2,1,2]
value = 2

while value in list_a:
    list_a.remove(value)
    print(list_a)
print()


# 모든 요소 제거하기
list_b = [1,2,3,4,5]
while len(list_b) is not 0:
    list_b.pop()
    print(list_b)