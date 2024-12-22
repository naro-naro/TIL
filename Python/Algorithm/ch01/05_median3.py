# 세 정수를 입력받아 중앙값 구하기 1

def med3(a, b, c):
    # a >= b >= c ----> b
    if a >= b:
        if b >= c:
            return b
        
        # c >= a >= b ----> a
        elif a <= c:
            return a
        
        # a >= c >= b ----> c
        else:
            return c
    
    # b > a > c ----> a
    elif a > c:
        return a
    
    # b > c >= a ----> c
    elif b > c:
        return c
    
    # c >= b > a ----> b
    else:
        return b
    
print('세 정수의 중앙값을 구합니다.')
a = int(input("정수 a의 값을 입력하세요.: "))
b = int(input("정수 b의 값을 입력하세요.: "))
c = int(input("정수 c의 값을 입력하세요.: "))

print("중앙값은 {}입니다.".format(med3(a,b,c)))