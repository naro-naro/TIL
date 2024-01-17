score = int(input("점수 : "))
if score>= 90:
    print("A", end = '')
else:
    if score>= 80:
        print("B", end='')
    else:
        if score >= 70:
            print("C",end='')
        else:
            if score >= 60:
                print("D", end = '')
            else:
                print("F", end='')
print("학점입니다")