# 리스트 - 순서를 가지는 객체의 집합
# 리스트 [ ]

# 지하철 칸별로 10명, 20명, 30명

# subway1 = 10
# subway2 = 20
# subway3 = 30

subway = [10, 20, 30]
print(subway)

subway = ['유재석', '조세호', '박명수']
print(subway)

# 조세호는 몇번째 칸에 탔는가?
print(subway.index('조세호'))

# 하하가 다음 정류장에서 다음 칸에 탔다
subway.append('하하')
print(subway)

# 정형돈을 유재석과 조세호 사이칸에 태운다
subway.insert(1,'정형돈')
print(subway)

# 지하철에 있는 사람을 한 명씩 뒤에서부터 꺼냄
print(subway.pop())
print(subway)

# 같은 이름의 사람이 몇명 있는지 확인하기
subway.append('유재석')
print(subway)
print(subway.count('유재석'))

# 정렬도 가능
num_list = [5,2,3,7,1]
num_list.sort()
print(num_list)

# 순서 뒤집기
num_list.reverse()
print(num_list)

# # 모두 지우기
# num_list.clear()
# print(num_list)

# 다양한 자료형 함께 사용
mix_list = ['조세호', 20, True]
print(mix_list)

# 리스트 확장 (두 리스트 합치기)
num_list.extend(mix_list)
print(num_list)