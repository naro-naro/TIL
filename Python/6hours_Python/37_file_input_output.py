# 파일 입출력

# score_file = open("score.txt", "w", encoding = "utf8")
# # score.txt라는 파일을 열것이고, w:쓰기전용파일이며, utf8:안쓰면 한글을 인식못함
# print('math : 0', file = score_file)
# print('english : 50', file = score_file)
# score_file.close()
# # math : 0, english : 50 이 적힌 score.txt 파일이 생성됨


# score_file = open("score.txt", "a", encoding = "utf8")
# # a : append - 덮어쓰기
# score_file.write("science : 100")
# score_file.write("\nhistory : 90")
# score_file.close


# score_file = open("score.txt", "r", encoding = "utf8")
# # r : 읽기
# print(score_file.read())
# score_file.close()
# # 출력창에 score.txt의 모든 내용이 출력됨


# score_file = open('score.txt', 'r', encoding = "utf8")
# print(score_file.readline())
# print(score_file.readline())
# # 줄별로 읽기, 한 줄 읽고 커서는 다음줄로 이동
# print(score_file.readline(), end = "")
# print(score_file.readline(), end = "")
# score_file.close()


# # 총 몇줄인지 모를 때 반복문 이용하기
# score_file = open('score.txt', "r", encoding = "utf8")
# while True:
#     line = score_file.readline()
#     print(line, end="")
#     if not line:
#         break
# score_file.close()


score_file = open('score.txt', 'r', encoding = 'utf8')
lines = score_file.readlines()  # list형태로 저장
for line in lines:
    print(line, end="")
score_file.close()