print()

dict_ex = {
    "키1":"값1",
    "키2":"값2",
    "키3":"값3"
}
print("# 딕셔너리의 items() 함수 결과 출력하기")
print("item() :", dict_ex.items())
print()

print("# 딕셔너리의 items() 함수 조합해서 사용하기")
for key,element in dict_ex.items():
    print("dict[{}] = {}".format(key,element))

print()