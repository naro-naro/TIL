def mul_all(*values):
    result = 1
    for i in values:
        result *= i
    return result
print(mul_all(5,7,9,10))