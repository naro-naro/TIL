# 반복문

# print('대기번호 : 1')
# print('대기번호 : 2')
# print('대기번호 : 3')
# print('대기번호 : 4')

for waiting_no in [1,2,3,4]:
    print('대기번호 : {}'.format(waiting_no))

print()

for waiting_no in range(1,5):
    print('대기번호 : {}'.format(waiting_no))

print()

starbucks = ['Ironman','Thor','Captain']
for customers in starbucks:
    print('{}, Here\'s your order.'.format(customers))