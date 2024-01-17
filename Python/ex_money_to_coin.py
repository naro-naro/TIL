my_money = 23760
for i in (5000,1000,500,100,50,10):
    my_coin = my_money//i
    print('{}원 : {}개'.format(i, my_coin))
    my_money %= i