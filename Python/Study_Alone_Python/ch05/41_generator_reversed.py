def reversed_list(list):
    if type(list) != list:
        return
    rev_list = []
    while len(list) != 0:
        rev_list.append(list.pop())
    return rev_list


list_a = [1,2,3,4,5]
print(reversed_list(list_a))

