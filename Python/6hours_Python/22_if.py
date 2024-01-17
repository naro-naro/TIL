# 분기 [명사]
# 1. 나뉘어서 갈라짐. 또는 그런 갈래.
# 2. [정보·통신 ] 프로그램의 실행 순서를 변경하여 다른 명령을 실행할 수 있게 하는 일.

# if 조건:
#   실행명령문

weather = input('Today\'s weather : ')
if weather == 'rain':
    print('Bring your umbrella.')
elif weather == 'cloud':
    print('Bring your mask.')
else:
    print('You don\'t have to bring anything.')

#--------------------------------------------------------
print()
#--------------------------------------------------------
temp = int(input('Today\'s temperature : '))
if temp >= 30:
    print('Is\'s too hot.')
elif 10 <= temp < 30:
    print('It\'s pretty mild.')
elif 0<= temp < 10:
    print('Bring your jacket.')
else:
    print('It\'s better to stay at home.')