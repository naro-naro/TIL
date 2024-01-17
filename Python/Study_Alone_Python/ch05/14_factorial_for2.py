def factorial(num):
    result = 1
    for i in range(1,num+1):
        result *= i
        i +=1
    return result

print("{}! = {}".format(5,factorial(5)))