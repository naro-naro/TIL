# 파이썬에서 제공하는 랜덤 라이브러리

from random import *
print(random()) #0.0 ~ 1.0 미만의 임의의 값을 생성
print(random() *10) #0.0 ~ 10.0 미만의 임의의 값을 생성
print(int(random() *10)) #0 ~ 10 미만의 임의의 자연수 생성
print(int(random() *10) +1) #1 ~ 10 이하의 임의의 자연수 생성

# 로또 번호 추첨하기
print(int(random()*45)+1) #1 ~ 45 이하의 임의의 자연수 생성
print(int(random()*45)+1) #1 ~ 45 이하의 임의의 자연수 생성
print(int(random()*45)+1) #1 ~ 45 이하의 임의의 자연수 생성
print(int(random()*45)+1) #1 ~ 45 이하의 임의의 자연수 생성
print(int(random()*45)+1) #1 ~ 45 이하의 임의의 자연수 생성
print(int(random()*45)+1) #1 ~ 45 이하의 임의의 자연수 생성

print(randrange(1,45)) #1 ~ 45 미만의 임의의 자연수 생성
print(randrange(1,46)) #1 ~ 45 이하의 임의의 자연수 생성

print(randint(1,45)) #1 ~ 45 이하의 임의의 자연수 생성