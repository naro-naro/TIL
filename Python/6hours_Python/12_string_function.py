# 문자열 처리 함수

python = "Python is Amazing"

# 전부 소문자로 출력
print(python.lower())

# 전부 대문자로 출력
print(python.upper())

# n번째 자리가 대문자인지 판별
print(python[0].isupper())

# 문자열의 길이 측정
print(len(python))

# 특정 구간의 문자열을 다른 문자열로 대체
print(python.replace("Python", "Java"))

# 문자열 내의 특정 문자의 위치 찾기
index = python.index("n")
print(index)
# 없는 문자를 입력하면 에러남
# index = python.index("w")
# print(index)

# 첫번째 n 이후의 다른 n의 위치 찾기
index = python.index("n", index + 1)
print(index)

# 비슷한 위치찾기 함수 - find
print(python.find("n"))
# 없는 문자를 입력하면 나오는 값 : -1
find = python.find("w")
print(find)

# 특정 문자가 몇 번 들어가는지 세기
print(python.count("n"))