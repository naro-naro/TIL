#시간을 기반으로 반복하기
import time
number = 0
target_tick = time.time()+5
while time.time() < target_tick:
    number += 1
print("5초동안 {}번 반복했습니다.".format(number))