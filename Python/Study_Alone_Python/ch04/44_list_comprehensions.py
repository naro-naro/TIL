# 리스트 내포 없이 20보다 작은 2의 배수의 제곱수로 이루어진 리스트를 만들 떄
array1 = []
for i in range(0,20,2):
    array1.append(i*i)
print(array1)
print()


# 리스트 내포
# 리스트이름 = [표현식 for 반복자 in 반복할 수 있는 것]
array2 = [i*i for i in range(0,20,2)]
print(array2)
print()

# if구문을 포함한 리스트 내포
# 리스트 이름 = [표현식 for 반복자 in 반복할수있는것 if 조건]
array3 = ["사과","망고",'딸기','킨더조이','샤인머스캣']
array4 = [i for i in array3 if i!='킨더조이']
print(array4)
