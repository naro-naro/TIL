# map()함수에 사용할 함수
def power(item):
    return item*item

# filter()함수에 사용할 함수
def under_3(item):
    return item<3

# map()함수와 filter()함수에 넣을 리스트
list_input_a = [1,2,3,4,5]

# map()함수 사용
output_a = map(power,list_input_a)      # 함수를 매개함수로 넣는 경우다
print()
print("     map(power,list_ouput_a)   : {}".format(output_a))
print("list(map(power,list_output_a)) : {}".format(list(output_a)))

# filter()함수 사용
output_b = filter(under_3,list_input_a)
print()
print("     filter(under_3,list_output_a)  : {}".format(output_b))
print("list(filter(under_3,list_output_a)) : {}".format(list(output_b)))