#입력한 돈에 따라 커피를 주는 자판기
coffee = 10
while True:
    money = int(input("돈을 넣어 주세요. : "))
    if money == 300:
        print("커피가 나왔습니다.")
        coffee -= 1
    elif money > 300:
        print("커피가 나왔습니다. \n 거스름돈 %d원 입니다."%(money-300))
        coffee -= 1
    else:
        print("돈이 부족합니다.")
        print("남은 커피는 %d개 입니다."%coffee)
    if coffee == 0:
        print("커피가 품절되었습니다. 판매를 중단합니다.")
        break