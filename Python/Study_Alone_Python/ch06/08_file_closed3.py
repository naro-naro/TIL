try:
    file = open("info3.txt","w")
    # 예외.발생해라()
except Exception as e:
    print(e)
finally:
    file.close()
    # finally로 예외가 발생 하든 안하든 파일을 닫는다!
print("# 파일이 제대로 닫혔는지 확인하기")
print("file.closed :",file.closed)