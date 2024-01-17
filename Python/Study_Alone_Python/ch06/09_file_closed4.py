try:
    file = open("info.txt","w")
    # 예외.발생해라()
except Exception as e:
    print(e)

# 아예 try except 구문이 끝나고 파일을 닫으면 아무 문제 없다!
file.close()
print("# 파일이 제대로 닫혔는지 확인하기")
print("file.closed : ",file.closed)