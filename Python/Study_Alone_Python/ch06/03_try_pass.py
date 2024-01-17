# 변수 선언
list_input_a = ["52","273","32","스파이","103"]

# 반복 
list_num = []
for item in list_input_a:
    try:
        list_num.append(int(item))
        # 예외 없이 통과하면 리스트에 넣기
    except:
        pass

print("{} 내부에 있는 숫자는".format(list_input_a))
print("{}입니다.".format(list_num))