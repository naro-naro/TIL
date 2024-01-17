# 람다 : 간단한 함수를 간단히 선언하기
# 형태) 함수이름 = lambda 매개변수 : 리턴값
power = lambda x : x**2
under_3 = lambda x : x<3

list_output = [1,2,3,4,5]

output_map = map(power,list_output)
print()
print(output_map)
print(list(output_map))

output_filter = filter(under_3,list_output)
print()
print(output_filter)
print(list(output_filter))