dict = {
    "name" : "tom",
    "job" : "police",
    "age" : 28,
    "face" : "hot"
}
# print(dict["nationarity"])
# 위에 해당하는 키가 없기 떄문에 오류 발생

key = input("그에 대해 알고싶은 정보를 입력하세요> ")
if key in dict:
    print(dict[key])
else:
    print("존재하지 않는 키입니다.")