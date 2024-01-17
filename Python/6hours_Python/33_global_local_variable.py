# 지역변수와 전역변수
# 지역변수 : 함수 내에서만 쓸 수 있는 변수
# 전역변수 : 함수 밖에서도 프로그램 내 어디서나 쓸 수 있는 변수

gun = 10
def checkpoint(soldiers): # 경계근무 군인의 수
    # gun = 20  # gun은 함수 내의 지역변수이기 때문에 함수 밖에선 초기화를 안해줘서 쓸수없다
    global gun # 전역공간에 있는 gun을 사용하겠다고 선언 
    gun = gun - soldiers    
    print("[함수 내] 남은 총 : {}개".format(gun))


def checkpoint_ret(gun, soldiers):
    gun = gun - soldiers
    print('(함수 내) 남은 총 : {}개'.format(gun))
    return gun
    # 리턴으로 함수 내의 값을 함수 밖으로 돌려주니까 전역변수를 선언하지 않아도 됨


print('전체 총 : {}'.format(gun))
# checkpoint(2)   # 2명이 경계근무 나감
gun = checkpoint_ret(gun, 2)
print('남은 총 : {}'.format(gun))