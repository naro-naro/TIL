#break를 사용하여 커피자판기 만들기
    #coffee가 0이 아니면 참, 0이 되면 거짓
coffee = 10
money = 300
while money:
    print("돈을 받았으니 커피를 줍니다.")
    coffee -=1
    print("남은 커피는 %d개입니다."%coffee)
    if not coffee:
        print("커피가 다 떨어졌습니다. 판매를 중단합니다.")
        break