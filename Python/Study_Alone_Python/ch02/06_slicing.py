print("hello"[1:4])
print("hello"[0:2])
print("hello"[1:3])
print("hello"[2:4])

print()

print("hello"[1:])
print("hello"[:3])

print()

# 슬라이싱 해도 원본은 변하지 않는다!
hello = "안녕하세요"
print(hello[0:2])
print(hello)