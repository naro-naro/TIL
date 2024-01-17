#1~10까지의 수 중 홀수만 출력하기
a = 0
while a<10:
    a +=1
    if a%2 == 0:
        continue
    print(a, end = " ")
#짝수가 되면 continue에서 끝나고 다음 숫자로 넘어감