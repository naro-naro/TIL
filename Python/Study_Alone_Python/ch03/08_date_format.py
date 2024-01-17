import datetime

now = datetime.datetime.now()

print("{}년 {}월 {}일 {}시 {}분 {}초입니다.".format(now.year, now.month, now.day, now.hour, now.minute, now.second))