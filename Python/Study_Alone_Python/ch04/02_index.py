list_a = [12,23,34,"문자열",True, False]
print(list_a[0])
print(list_a[2])
print(list_a[1:3])

list_a[3] = "변경"
print(list_a)
print(list_a[3])

# 인덱스에 음수를 넣어 뒤에서부터 선택하기
print(list_a[-1])
print(list_a[-2])
print(list_a[-3])

# 리스트 접근 연산자 이중 사용
print(list_a[3])
print(list_a[3][0])
print(list_a[3][1])

# 리스트안에 리스트 사용하기
list_b = [[1,2,3], [4,5,6], [7,8,9]]
print(list_b[0])
print(list_b[0][0])