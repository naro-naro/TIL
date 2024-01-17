# 리스트의 요소를 값으로 제거하기 : .remove()

list_c = [1,2,1,2]
list_c.remove(2)
print(list_c)
# 같은 값이 있으면 가장 앞의 요소를 제거함


# 여러개를 제거하고 싶으면 반복문과 조합해서 써야 함
list_d = [3,4,3,4,3,4,3,4]
while 4 in list_d:
    list_d.remove(4)
    print(list_d)
print(list_d)