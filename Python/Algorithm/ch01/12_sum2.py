# 1부터 n까지 정수의 합 구하기
# '2 + 3 + 4 + 5 = n' 꼴로

print('a부터 b까지 정수의 합 구하기')
a = int(input('정수 a의 값을 입력하세요.: '))
b = int(input('정수 b의 값을 입력하세요.: '))

if a > b:
    a, b = b, a

sum = 0
for i in range(a, b + 1):
    if i < b:
        print('{} + '.format(i), end='')
    else:
        print('{} = '.format(i), end='')
    sum += i

print(sum)