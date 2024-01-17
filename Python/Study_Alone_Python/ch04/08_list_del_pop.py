# 리스트에서 요소 제거하기1 : 인덱스로 제거하기
print()

list_a = [0,1,2,3,4,5,6,7,8,9]
print("# 리스트의 요소 하나 제거하기")

# del
del list_a[1]
print("del list_a[1] =",list_a)

# del로 범위를 지정해 여러개의 요소 한번에 삭제하기
del list_a[1:3]
print("del list_a[1:3] =",list_a)

# del의 범위 왼쪽을 지정하지 않으면 이하 전부 삭제
del list_a[:2]
print("del list_a[:2] =",list_a)

# del의 범위 오른쪽을 지정하지 않으면 이하 전부 삭제
del list_a[3:]
print("del list_a[3:] =",list_a)


# .pop(인덱스)
list_a.pop(2)
print("list_a.pop(2) =",list_a)

# .pop() : 인덱스에 아무것도 입력하지 않으면 맨 뒤의 요소가 삭제됨
list_a.pop()
print("list_a.pop() =",list_a)