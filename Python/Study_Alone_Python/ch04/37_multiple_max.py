max_value = 0
a = 0
b = 0

for i in range(1,100):
    j = 100 - i

    
    if i*j>max_value:
        a = i
        b = j
        max_value = i*j


print("최대가 되는 경우 : {} * {} = {}".format(a,b,max_value))