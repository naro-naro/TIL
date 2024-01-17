num = int(input("자연수를 입력하세요> "))
result = 1
for i in range(1,num+1):
    result *= i
    i += 1
print("{}! = {}".format(num,result))