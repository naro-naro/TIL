for i in range(5):
    print(i,"=반복변수")
print()

for i in range(5,10):
    print(str(i)+"=반복변수")
print()

for i in range(0,10,3):
    print(str(i)+"=반복변수")

# 프린트문 안에서 +로 연결하려면 둘 다 스트링이어야하나보다
# 서로 다른 자료형은 ,로 연결할 수 있는데 띄어쓰기가 자동으로 들어감
# +로 연결하면 띄어쓰기 없이 바로 붙음