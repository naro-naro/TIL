# 랜덤한 숫자를 만들기 위해 가져오기
import random

# 간단한 한글 리스트 만들기
han = list("abcdefghijklmnopqrstuvwxyz")

# 파일을 쓰기모드로 열기
with open("info.txt","w") as file:
    for i in range(1000):
        # 랜덤한 값으로 변수 생성하기
        name = random.choice(han)+random.choice(han)
        weight = random.randrange(40,100)
        height = random.randrange(140,200)

        # 텍스트를 쓰기
        file.write("{}, {}, {}\n".format(name,weight,height))