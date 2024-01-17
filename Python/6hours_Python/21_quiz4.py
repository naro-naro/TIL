# Quiz) 당신의 학교에서는 파이썬 코딩 대회를 주최합니다.
# 참여율을 높이기 위해 댓글 이벤트를 진행하기로 했습니다.
# 댓글 작성자들 중에 추첨을 통해 1명은 치킨, 3명은 커피를 받게 됩니다.
# 추첨 프로그램을 작성하시오.

# 조건1 : 댓글은 20명이 작성했고, 아이디는 1~20이라고 가정
# 조건2 : 댓글 내용과 상관없이 무작위로 추첨하되 중복 불가
# 조건3 : random 모듈의 shuffle과 sample을 활용

# (출력 예제)
#  -- 당첨자 발표 --
# 치킨 당첨자 : 1
# 커피 당첨자 : [2, 3, 4]
#  -- 축하합니다 --

# (활용 예제)
# from random import *
# lst = [1,2,3,4,5]
# print(lst)
# shuffle(lst) # 순서 섞기
# print(lst)
# print(sample(lst,1)) # 무작위로 하나 뽑기

#----------------------------------------------------------------------------------------
# 내가 푼 답
from random import *
id = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]
shuffle(id)
winner = sample(id,4)
print(' --당첨자 발표--\n치킨 당첨자 : '+ str(winner.pop()) + '\n커피 당첨자 : ' + str(winner) +'\n --축하합니다--')

#----------------------------------------------------------------------------------------
print()
#----------------------------------------------------------------------------------------
# 동영상 답안
from random import *
users = range(1,21) # 1부터 21전까지 숫자를 생성
# print(type(users)) # type이 range이므로 list로 변환해야함
users = list(users)
# print(type(users)) #type이 list가 되었음을 확인
print(users)
shuffle(users)
print(users)
print()

winners = sample(users,4)
print(' -- 당첨자 발표 --')
print('치킨 당첨자 : {}'.format(winners[0]))
print('커피 당첨자 : {}'.format(winners[1:]))
print(' -- 축하합니다 --')