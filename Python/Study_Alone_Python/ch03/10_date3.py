import datetime

now = datetime.datetime.now()

if 3 <= now.month <6:
    print("현재 {}월이므로 계절은 봄입니다.".format(now.month))
elif 6<= now.month <9:
    print("현재 {}월이므로 계절은 여름입니다.".format(now.month))
elif 9<= now.month <12:
    print("현재 {}월이므로 계절은 가을입니다.".format(now.month))
else:
    print("현재 {}월이므로 계절은 겨울입니다.".format(now.month))