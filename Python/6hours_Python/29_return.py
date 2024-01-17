# 전달값과 반환값

def open_account():
    print('New account is created.')


def deposit(balance, money):
    print('Deposit completed. The balance is ${}.'.format(balance + money))
    return balance + money          # 반환


def withdraw(balance, money):
    if balance > money:
        print('Withdraw completed. The balance is ${}.'.format(balance - money))
        return balance - money
    else:
        print('Withdraw failed. The balance is ${}.'.format(balance))
        return balance


def withdraw_night(balance, money):
    commission = 1
    print('Commission is ${}, and The balance is ${}.'.format(commission, balance - money - commission))
    return commission, balance - money - commission



balance = 0
balance = deposit(balance, 100)
balance = withdraw(balance, 200)
balance = withdraw(balance, 50)
balance = withdraw_night(balance, 10)