import time
num = 0
target_tick = time.time() + 5

while time.time() < target_tick:
    num+=1
print("5초동안 {}번 반복함".format(num))