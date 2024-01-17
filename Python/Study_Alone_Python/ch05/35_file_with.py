# with을 이용해서 파일을 열면
# with구문이 끝날떄 파일이 자동으로 닫힌다
with open("file_basic_with.txt","w") as file:
    file.write("francais, c'est trop rapide...")