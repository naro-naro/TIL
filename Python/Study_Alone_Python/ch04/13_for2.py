numbers = [273, 103, 5, 32, 65, 9 ,72, 800, 99]

# 나의 풀이
for num in numbers:
    if num/10<1:
        print(num,'는 1자릿수입니다.')
    elif num/10<10:
        print(num,'는 2자릿수입니다.')
    else:
        print(num,'는 3자릿수입니다.')

print()

for num in numbers:
    print(num,'는',len(str(num)),'자릿수입니다.')
