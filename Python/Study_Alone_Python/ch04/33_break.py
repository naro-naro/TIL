i = 1
while True:
    print("{}번쨰 반복문입니다.".format(i))
    i+=1
    answer = input("프로그램 종료를 원하시면 'y'를 눌러주세요 : ")
    if answer in  ["y",'Y']:
        print("프로그램을 종료합니다.")
        break
