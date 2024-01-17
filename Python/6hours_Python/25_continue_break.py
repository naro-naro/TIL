# 책 읽기 번호 뽑기
absent = [2, 5] # 결석자
no_book = [7] # 책을 안가져온 학생
for student in range(1, 11): # 출석번호가 1~10
    if student in absent: # 만약 지금 발표중인 한생이 결석했다면
        continue # 위의 if 조건을 성립하여 continue를 만나면 아래 프린트문을 실행하지 않고 다시 위의 반복문으로 돌아감
    elif student in no_book:
        print('Today\'s class is finished. {0}, Come with me to my room.'.format(student))
        break # 반복 중지
    print("{0}, Read your textbook.".format(student))

# continue 는 아래 문장을 실행하지 않고 위의 다음 반복으로 다시 돌아가게 하는 명령어
# break 는 다음 반복이 남아있건 아니건 그 시점에서 반복문 탈출