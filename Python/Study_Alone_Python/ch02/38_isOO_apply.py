
while True:

    answer = input("아무거나 입력하세요 : ")
    if answer.isdigit():
        print("숫자만 입력하셨군요!")
    elif answer.isalpha():
        print("알파벳만 입력하셨군요!")
    elif answer.isalnum():
        print("숫자와 알파벳만 입력하셨군요!")
    else:
        print("정말로 아무거나 입력하셨군요!")
    