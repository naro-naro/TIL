list_a = [1,2,3]
list_b = [4,5,6]


print(list_a+list_b)
print(list_a)
# 원본이 변하지 않음 : 비파괴적
# 원본도 사용할 수 있는 유용함


list_a.extend(list_b)
print(list_a)
# 원본이 변함 : 파괴적
# 용량을 절약할 수 있는 효율성