output = [num for num in range(1,100+1) if "{:b}".format(num).count("0") == 1]

for i in output:
    print("{} : {}".format(i, "{:b}".format(i)))
print("sum :", sum(output))