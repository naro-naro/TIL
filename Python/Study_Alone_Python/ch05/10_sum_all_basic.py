def sum_all(start,end):
    result = 0
    for i in range(start,end+1):
        result+=i
    return result
print(sum_all(0,100))
print(sum_all(0,1000))
print(sum_all(50,100))
print(sum_all(500,1000))