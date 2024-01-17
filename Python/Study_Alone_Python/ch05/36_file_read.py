# 파일 열기
# "r"로 읽기모드
with open("basic.txt","r") as file:
    # 파일 읽기
    content = file.read()
# 파일 출력
print(content)