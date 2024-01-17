list_output = [1,2,3,4,5]

# 람다를 이용해 함수를 선언하지도 않고 바로 매개변수로 넣어버리기
output_map = map(lambda x:x*x, list_output)
print()
print(output_map)
print(list(output_map))

output_filter = filter(lambda x:x<3, list_output)
print()
print(output_filter)
print(list(output_filter))