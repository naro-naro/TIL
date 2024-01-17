# 반복문 while
# while (조건):

customer = 'Thor'
index = 5
while index >= 1:
    print('{}, Here\'s your order. The chance is left {} times'.format(customer,index)) 
    index -= 1
    if index == 0:
        print('{}\'s coffee is discarded'.format(customer))


print()

# 무한반복문
# 종료할땐 cntl + c
# customer = "Ironman"
# index = 1
# while True:
#     print('{}, Here\'s your order. The chance is left {} times'.format(customer,index)) 
#     index += 1

print()

customer = 'Captain'
person = 'Unknown'
while person != customer:
    print('{}, Here\'s your order.'.format(customer)) 
    person = input('What is your name? : ')