# Quiz) 당신은 카카오 택시 서비스르 이용하는 택시기사입니다.
# 50명의 승객과 매칭 기회가 있을 때, 총 탑승 승객 수를 구하는 프로그램을 작성하세요.

# 조건1 : 승객별 운행 소요시간은 5~50분 사이의 난수로 정해집니다.
# 조건2 : 당신은 소요시간 5~15분 사이의 승객만 매칭해야 합니다.

# (출력문 예제)
# [O] 1번째 손님 (소요시간 : 15분)
# [ ] 2번째 손님 (소요시간 : 50분)
# [O] 3번째 손님 (소요시간 : 5분)
# ...
# [ ] 50번째 손님 (소요시간 : 16분)

# 총 탑승 승객 : 2분

#--------------------------------------------------------------------------------------------------
# 내 답안
from random import *
passenger = range(5, 51)
passenger = list(passenger)
shuffle(passenger)
index = 1
O_passenger = 0
for i in passenger:
    if i > 15:
        print('[ ] {0}번째 손님 (소요시간 : {1}분)'.format(index, i))
        index += 1
    else:
        print('[O] {0}번째 손님 (소요시간 : {1}분)'.format(index, i))
        index += 1
        O_passenger += 1
print()
print('총 탑승 승객 : {0}분'.format(O_passenger))

#--------------------------------------------------------------------------------------------------------------
print()
#--------------------------------------------------------------------------------------------------------------
# 동영상 답안
from random import *
count = 0                                 # 총 탑승 승객 수
for j in range(1,51):                    # 1~50번 승객
    time = randrange(5, 51)             # 5~50분 소요 시간
    if time <= 15:                 # 매칭 성공 - 5~15분이내의 손님, 탑승 승객 수 증가 처리
        print('[O] {0}번째 손님 (소요시간 : {1}분)'.format(j, time))
        count += 1
    else:                               # 매칭 실패한 경우
        print('[ ] {0}번째 손님 (소요시간 : {1}분)'.format(j, time))
print()
print('총 탑승 승객 : {0}분'.format(count))