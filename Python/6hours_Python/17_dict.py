# 사전 { }
# 사전에서는 키 중복이 허용되지 않는다

# 사우나 손님들에게 사물함 열쇠키 배정하기

cabinet = {3:'유재석', 100:'김태호'}
print(cabinet[3])
print(cabinet[100])

print(cabinet.get(3))

# 없는 값 입력했을때
# print(cabinet[5]) # 에러 후 프로그램 종료
print(cabinet.get(5)) # 에러 안나고 NONE 출력
print(cabinet.get(5, '비어있는 key')) # NONE 대신 '비어있는 key' 출력

# key가 있는지 확인하기
print(3 in cabinet) # boolean값으로 출력됨
print(5 in cabinet)

# key 단어는 int 말고도 string 변수형도 가능
cab = {'A-3':'유재석', 'B-100':'김태호'}
print(cab['A-3'])
print(cab['B-100'])

# 새 손님
print(cab)
cab['B-100'] = '김종국'
cab['C-20'] = '조세호'
print(cab)

# 간 손님
del cab['C-20']
print(cab)

# 현재 사용중인 key들만 출력
print(cab.keys())

# 현재 사용중인 value들만 출력
print(cab.values())

# key와 value를 쌍으로 출력
print(cab.items())

# 목욕탕 마감 : 모든 키 비우기
cab.clear()
print(cab)