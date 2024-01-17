list_a = ["요소a","요소b","요소c"]

print()
print("단순 출력")
print(list_a)
print()

print("# enumerate() 함수 적용 출력")
print(enumerate(list_a))
print()

print("# list() 함수로 강제 변환해 출력")
print(list(enumerate(list_a)))